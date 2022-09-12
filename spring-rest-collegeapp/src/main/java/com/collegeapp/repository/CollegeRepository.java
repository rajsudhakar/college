package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

//	void addCollege(College college);
//	void updateCollege(College college);
//	void deleteById(int collegeId);
//	
//	void getById(int collegeId);
//	List<College> getByUniversity(String university);
//	List<College> getByCity(String city);
//	List<College> getByDepartment(String department);
//	List<College> getByDepartmentAndUniversity(String department,String university);
//      
	
}
