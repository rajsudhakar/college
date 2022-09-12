package com.collegeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.collegeapp.model.College;

@Service
public class CollegeServiceImpl implements ICollegeservice{

	@Override
	public void addCollege(College college) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatecollege(College college) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int collegeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getById(int collegeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<College> getByUniversity(String university) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getByDepartmentAndUniversity(String department, String university) {
		// TODO Auto-generated method stub
		return null;
	}

}
