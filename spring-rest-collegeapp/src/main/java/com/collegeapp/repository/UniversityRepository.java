package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

//	void addUniversity(University university);
//	void updateUniversity(University university);
//	void deleteById(int universityId);
//	
//	void getById(int universityId);
//	List<University> getByCity(String city);
//	List<University> getByCollege(String collegeName);
//	List<University> getByDepartment(String department);
//	
}
