package com.ManyToMany.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String name;
	@ManyToMany
	private List<Worker> wor;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String name, List<Worker> wor) {
		super();
		this.name = name;
		this.wor = wor;
	}
	@Override
	public String toString() {
		return "Project [wid=" + pid + ", name=" + name + ", wor=" + wor + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Worker> getWor() {
		return wor;
	}
	public void setWor(List<Worker> wor) {
		this.wor = wor;
	}
}
