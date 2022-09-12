package com.collegeapp.service;

import java.util.List;

import com.collegeapp.model.University;

public interface IUniversityService {

	

	void addUniversity(University university);
	void updateUniversity(University university);
	void deleteById(int universityId);
	
	void getById(int universityId);
	List<University> getByCity(String city);
	List<University> getByCollege(String collegeName);
	List<University> getByDepartment(String department);
	
}
