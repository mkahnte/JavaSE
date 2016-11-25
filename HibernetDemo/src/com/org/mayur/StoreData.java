package com.org.mayur;

import java.util.Enumeration;
import java.util.Iterator;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StoreData 
{
	private int id;
	private String firstName;
	private String lastName;
	
	public StoreData()
	{
		
	}
	
	public StoreData(int id, String firstName, String lastName)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName =lastName;

	}
		
	public void store()
	{
		Configuration cfg = new Configuration();
	
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
	
		session.persist(e1);
		transaction.commit();
		
		session.close();
		
		System.out.println(" Done ... !");
		
		
	}
}