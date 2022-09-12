package com.collegeapp.service;

import java.util.List;

import com.collegeapp.model.College;

public interface ICollegeservice {

	

	void addCollege(College college);
	void updatecollege(College college);
	void deleteById(int collegeId);
	
	void getById(int collegeId);
	List<College> getByUniversity(String university);
	List<College> getByCity(String city);
	List<College> getByDepartment(String department);
	List<College> getByDepartmentAndUniversity(String department,String university);
      
}
