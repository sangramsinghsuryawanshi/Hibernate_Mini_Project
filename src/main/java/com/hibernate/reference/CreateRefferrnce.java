package com.hibernate.reference;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateRefferrnce {

	public static void main(String[] args) 
	{
		SessionFactory sf = HibernateConfiguration.getSession();
		System.out.println(sf);
		Address ad = new Address("ABCD","Java");
		Stud s = new Stud("Appa", ad);
		Session ss = sf.openSession();
		Transaction tf = ss.beginTransaction();
		ss.save(ad);
		ss.save(s);
		tf.commit();
		ss.close();
	}

}
