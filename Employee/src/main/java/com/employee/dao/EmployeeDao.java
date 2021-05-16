package com.employee.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepositoryImplementation<Employee, Integer> {

}
