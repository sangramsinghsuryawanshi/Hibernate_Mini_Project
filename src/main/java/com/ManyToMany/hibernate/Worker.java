package com.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Worker 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wid;
	private String name;
	@ManyToMany
	private List<Project> pro;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getPro() {
		return pro;
	}
	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Worker [wid=" + wid + ", name=" + name + ", pro=" + pro + "]";
	}
	public Worker(String name, List<Project> pro) {
		super();
		this.name = name;
		this.pro = pro;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
