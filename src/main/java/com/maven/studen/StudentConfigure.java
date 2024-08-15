package com.maven.studen;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class StudentConfigure 
{
	private static SessionFactory sefac;
	public static SessionFactory getStuConfigure()
	{
		Configuration cf = new Configuration();
		Properties pp = new Properties();
		pp.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		pp.put(Environment.URL, "jdbc:mysql://localhost:3306/mavenHibernateMini");
		pp.put(Environment.USER, "root");
		pp.put(Environment.PASS, "12345");
		pp.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		pp.put(Environment.HBM2DDL_AUTO, "create");
		pp.put(Environment.SHOW_SQL, "true");
		cf.addProperties(pp);
		cf.addAnnotatedClass(Student.class);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
		sefac = cf.buildSessionFactory(sr);
		return sefac;
	}
}
