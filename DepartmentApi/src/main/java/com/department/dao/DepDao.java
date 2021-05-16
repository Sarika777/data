package com.department.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.model.Department;

public interface DepDao extends JpaRepository<Department, Integer>{

}
