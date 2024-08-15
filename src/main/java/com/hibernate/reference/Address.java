package com.hibernate.reference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String course;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address(String course, String address) {
		super();
		this.course = course;
		this.address = address;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
