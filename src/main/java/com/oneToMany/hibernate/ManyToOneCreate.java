package com.oneToMany.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToOneCreate {

	public static void main(String[] args) 
	{
		SessionFactory sf = PersonAddConfiguration.getSession();
		AddressPerson ad = new AddressPerson("karad");
		AddressPerson ad1 = new AddressPerson("pune");
		AddressPerson ad2 = new AddressPerson("ap");
		List<AddressPerson> al = new ArrayList<AddressPerson>();
		al.add(ad);
		al.add(ad1);
		al.add(ad2);
		Person p = new Person("Sangram",al);
		Session ss = sf.openSession();
		Transaction tf = ss.beginTransaction();
		ss.save(p);
		ss.save(ad);
		ss.save(ad1);
		ss.save(ad2);
		tf.commit();
		ss.close();
		System.out.println("Data inserted.......!");

	}

}
