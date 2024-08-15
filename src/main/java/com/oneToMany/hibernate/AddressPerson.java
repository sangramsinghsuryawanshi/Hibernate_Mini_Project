package com.oneToMany.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class AddressPerson 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Address;
	public AddressPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressPerson [id=" + id + ", Address=" + Address + "]";
	}
	public AddressPerson(String address) {
		super();
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
