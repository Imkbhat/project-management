package com.example.luv2code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.luv2code.dao.EmployeeRepository;
import com.example.luv2code.entities.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository; 

	@GetMapping("/new")
	public String registerEmployee(Model m) {
		m.addAttribute("employee", new Employee());
		return "employee/new-employee";
	}
	
	@PostMapping("/save")
	public String saveEmployee(Employee employee, Model model) {
		employeeRepository.save(employee);
		return "redirect:/list-employees";
	}
}
