package com.example.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.luv2code.dao.EmployeeRepository;
import com.example.luv2code.dao.ProjectRepository;

@SpringBootApplication
public class ProjectManagementApplication {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ProjectRepository projectRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner runner() {
		return args -> {
			Employee emp1 = new Employee("Kiran", "Bhatt", "kb@gmail.com");
			Employee emp2 = new Employee("Virat", "Kohli", "vk@gmail.com");
			Employee emp3 = new Employee("Steve", "Smith", "ss@gmail.com");
			
			Employee emp4 = new Employee("Kane", "Williamson", "kw@gmail.com");
			Employee emp5 = new Employee("Joe", "Root", "jr@gmail.com");
			Employee emp6 = new Employee("Prithvi", "Shaw", "ps@gmail.com");
			
			Employee emp7 = new Employee("Aron", "Finch", "af@gmail.com");
			Employee emp8 = new Employee("Ravindra", "jadeja", "rj@gmail.com");
			Employee emp9 = new Employee("Shreyas", "Iyer", "si@gmail.com");
			
			Project p1 = new Project("Large Production Deploy", "NOTSTARTED", "dEPLOYEMENT TO Production.");
			Project p2 = new Project("New Employee Budget", "COMPLETED", "New Employee Hired.");
			Project p3 = new Project("Improve Internet Security", "INPROGRESS", "Need to improve Internet Security.");
			
			p1.addEmployee(emp1);
			p1.addEmployee(emp2);
			p2.addEmployee(emp3);
			p3.addEmployee(emp1);
			p3.addEmployee(emp2);
			
			
			emp1.setProjects(Arrays.asList(p1,p3));
			emp2.setProjects(Arrays.asList(p3));
			emp3.setProjects(Arrays.asList(p2));
			
			projectRepository.save(p1);
			projectRepository.save(p2);
			projectRepository.save(p3);
			
			employeeRepository.save(emp1);
			employeeRepository.save(emp2);
			employeeRepository.save(emp3);
			employeeRepository.save(emp4);
			employeeRepository.save(emp5);
			employeeRepository.save(emp6);
			employeeRepository.save(emp7);
			employeeRepository.save(emp8);
			employeeRepository.save(emp9);
		};
	}*/
}
