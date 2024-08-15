package com.hibernate.reference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Stud 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne
	private Address address;
	
	public Stud(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
}
