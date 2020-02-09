package com.example.luv2code.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.luv2code.dto.EmployeeProjectDTO;
import com.example.luv2code.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	@Query(nativeQuery=true, value=" SELECT e.first_name AS firstName, e.last_name as lastName,e.email AS email, COUNT(pe.employee_id) AS projectCount "
			+ " FROM employee e LEFT JOIN project_employee pe ON (pe.employee_id = e.employee_id) "
			+ " GROUP BY e.first_name, e.last_name, e.email ORDER BY 4 DESC ")
	public List<EmployeeProjectDTO> employeeProjects();
}
