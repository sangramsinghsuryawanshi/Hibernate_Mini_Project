package com.maven.mini;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        SessionFactory sf = HibernateConfigure.getSession();
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
           
           Employee emp = new Employee(id,name);
           Session ss = sf.openSession();
           Transaction ts = ss.beginTransaction();
           ss.save(emp);
           ts.commit();
           ss.close();
       }
        
    }
}
