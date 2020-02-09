package com.example.luv2code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.luv2code.dao.EmployeeRepository;
import com.example.luv2code.dao.ProjectRepository;
import com.example.luv2code.dto.ChartDataDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HomeController {
	
	@Autowired 
	private ProjectRepository projectRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String listAllProjectAndEmployees(Model m) throws JsonProcessingException {
		Map<String, Object> map = new HashMap<>();
		
		m.addAttribute("employees", employeeRepository.employeeProjects());
		m.addAttribute("projects", projectRepository.findAll());
		
		List<ChartDataDTO> projectData = projectRepository.getProjectStats();
		
		//Convert Project data into JSON Structure for js
		
		ObjectMapper objMapper = new ObjectMapper();
		String jsonString  = objMapper.writeValueAsString(projectData);
		//[{"value":1,"label":"COMPLETED"},{"value":1,"label":"INPROGRESS"},{"value":1,"label":"NOTSTARTED"}]

		m.addAttribute("projectStatusCount", jsonString);
		
		return "main/home";
	}
	
	@GetMapping("/list-employees")
	public String listAllEmployees(Model m) {
		m.addAttribute("employees", employeeRepository.findAll());
		return "employee/list-employees";
	}
	
	@GetMapping("/list-projects")
	public String listAllProjects(Model m) {
		m.addAttribute("projects", projectRepository.findAll());
		return "project/list-projects";
	}
}
