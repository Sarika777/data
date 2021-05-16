package com.department.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	 private String deptname;
	 @Id
	 private int depid;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	 

}
