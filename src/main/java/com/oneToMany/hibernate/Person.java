package com.oneToMany.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany
	private List<AddressPerson> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AddressPerson> getAddress() {
		return address;
	}
	public void setAddress(List<AddressPerson> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Person(String name, List<AddressPerson> address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
