package com.example.luv2code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.luv2code.dao.EmployeeRepository;
import com.example.luv2code.dao.ProjectRepository;
import com.example.luv2code.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/new")
	public String displayProjectForm(Model m) {
		m.addAttribute("project", new Project());
		m.addAttribute("allEmployees", employeeRepository.findAll());
		return "project/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, Model m) {
		projectRepository.save(project);

		return "redirect:/list-projects"; //redirect prevents duplicate submissions
	
	}
}
