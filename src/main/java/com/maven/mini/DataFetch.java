package com.maven.mini;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DataFetch 
{
	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfigure.getSession();
		Session ss = sf.openSession();
		Employee emp = ss.load(Employee.class, 1);
		System.out.println(emp);
		
		Employee emp1 = ss.get(Employee.class, 2);
		System.out.println(emp1);
	}
}