package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

@Service
public class EmployeeServices {
	@Autowired
	public EmployeeDao empdao;
	public Employee add(Employee emp) {
		return empdao.save(emp);
	}
     public Iterable<Employee> getEmployee(){
		return empdao.findAll();
	
     }
	
}
