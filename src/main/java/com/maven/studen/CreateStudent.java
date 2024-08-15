package com.maven.studen;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateStudent 
{

	public static void main(String[] args) 
	{
		SessionFactory sf = StudentConfigure.getStuConfigure();
		System.out.println(sf);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number of entry: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
    	   System.out.println("Enter your id: ");
    	   int id = sc.nextInt();
           sc.nextLine();
           
           System.out.println("Enter your name: ");
           String name = sc.nextLine();
           
           System.out.println("Enter your course: ");
           String course = sc.nextLine();
           
           System.out.println("Enter your city: ");
           String city = sc.nextLine();
           
           System.out.println("Enter your age: ");
    	   int age = sc.nextInt();
    	   
           Student std = new Student(id,name,course,city,age);
           Session ss= sf.openSession();
           Transaction ts = ss.beginTransaction();
           ss.save(std);
           ts.commit();
           ss.close();
       }
	}

}
