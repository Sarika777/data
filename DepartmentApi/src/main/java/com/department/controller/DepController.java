package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.model.Department;
import com.department.service.DepService;

@RestController
public class DepController {
	@Autowired
	private DepService service;
	
	@PostMapping("/adddepartment")
	public Department addDept(@RequestBody Department dept) {
		return service.create(dept);
		
	}
     
	@GetMapping("/get")
	public Iterable<Department> getDetails(){
		return service.getDepartments();
	}
}
