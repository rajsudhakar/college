package com.collegeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {
	@Column(length = 20)
	public String departmentname;
	@Column(length = 20)
	public String departmentHead;
	@Id
	@GeneratedValue(generator = "department_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "department_id",sequenceName = "department_seq",initialValue = 10,allocationSize = 1)
	public  Integer departmentId;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departmentname, String departmentHead) {
		super();
		this.departmentname = departmentname;
		this.departmentHead = departmentHead;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Department [departmentname=" + departmentname + ", departmentHead=" + departmentHead + ", departmentId="
				+ departmentId + "]";
	}
	
	
}
