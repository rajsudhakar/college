package com.collegeapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class University {

	@Column(length = 20)
	public String universityName;
	@Id
	@GeneratedValue(generator = "university_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "university_id",sequenceName = "university_seq",initialValue = 10,allocationSize = 1)
	public Integer universityId;
	@Column(length = 20)
	public String city;
	@OneToMany
	public Set<College> colleges;
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String universityName, String city, Set<College> colleges) {
		super();
		this.universityName = universityName;
		this.city = city;
		this.colleges = colleges;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", universityId=" + universityId + ", city=" + city
				+ ", colleges=" + colleges + "]";
	}
	
	
}
