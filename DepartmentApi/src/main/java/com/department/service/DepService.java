package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.dao.DepDao;
import com.department.model.Department;

@Service
public class DepService {

@Autowired
  private DepDao dao;
   public Department create(Department dep) {
	   return dao.save(dep);
   }
   public Iterable<Department> getDepartments(){
	   return dao.findAll();
   }
}
