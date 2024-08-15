package com.hibernate.reference;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.maven.mini.Employee;

public class HibernateConfiguration 
{
	private static SessionFactory sessionfac;
	public static SessionFactory getSession()
	{
		Configuration cfg = new Configuration();
		Properties pro = new Properties();
		pro.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		pro.put(Environment.URL, "jdbc:mysql://localhost:3306/mavenHibernateMini");
		pro.put(Environment.USER, "root");
		pro.put(Environment.PASS, "12345");
		pro.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		pro.put(Environment.HBM2DDL_AUTO,"update");
		pro.put(Environment.SHOW_SQL, "true");
		cfg.setProperties(pro);
		cfg.addAnnotatedClass(Stud.class);
		cfg.addAnnotatedClass(Address.class);
		ServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionfac = cfg.buildSessionFactory(ssr);
		return sessionfac;
	}
}
