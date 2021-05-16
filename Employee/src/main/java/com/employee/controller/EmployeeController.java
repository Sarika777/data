package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.services.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeServices empservice;
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		return empservice.add(emp);
		
	}
	@GetMapping("/get")
	public Iterable <Employee> getDetails(){
		return empservice.getEmployee();
		
	}

}
