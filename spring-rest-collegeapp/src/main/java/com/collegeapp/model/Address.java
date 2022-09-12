package com.collegeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(generator = "address_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "address_id",sequenceName = "address_seq",initialValue = 10,allocationSize = 1)
	public Integer addressId;
	@Column(length = 20)
	public String city;
	@Column(length = 20)
	public String state;
	@Column(length = 20)
	public String location;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String city, String state, String location) {
		super();
		this.city = city;
		this.state = state;
		this.location = location;
	}


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", location=" + location
				+ "]";
	}

	
	
}
