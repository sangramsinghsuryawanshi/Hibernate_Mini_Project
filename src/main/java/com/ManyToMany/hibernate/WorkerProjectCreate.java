package com.ManyToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class WorkerProjectCreate {

	public static void main(String[] args) 
	{
		Worker wor = new Worker();
		wor.setName("Abcd");
		
		Worker wor1 = new Worker();
		wor1.setName("XYZ");
		
		List<Worker> al = new ArrayList<Worker>();
		al.add(wor);
		al.add(wor1);
		
		
		Project pro = new Project();
		pro.setName("Book Management System");
		
		Project pro1 = new Project();
		pro1.setName("Bank Management System");

		List<Project> al1 = new ArrayList<Project>();
		al1.add(pro);
		al1.add(pro1);
		wor.setPro(al1);
		wor1.setPro(al1);
		pro.setWor(al);
		pro1.setWor(al);
		
		SessionFactory sr = ProWorHiberConfiguration.getSession();
		Session ss = sr.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(wor);
		ss.save(wor1);
		ss.save(pro);
		ss.save(pro1);
		tr.commit();
		ss.close();
		System.out.println("Data Inserted Successfully.....!");
	}

}
