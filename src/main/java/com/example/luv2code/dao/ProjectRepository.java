package com.example.luv2code.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.luv2code.dto.ChartDataDTO;
import com.example.luv2code.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	
	@Query(nativeQuery= true, value= " SELECT COUNT(*) as value, stage AS label FROM project GROUP BY stage ")
	public List<ChartDataDTO> getProjectStats();

}
