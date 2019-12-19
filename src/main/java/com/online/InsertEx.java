package com.online;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cnf = new Configuration();
		cnf.configure("hibernate.cng.xml");
		SessionFactory sf =cnf.buildSessionFactory();
		Session se =sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Student st = new Student();
		st.setId(222);
		st.setName("GHI");
		st.setFees(20000);
		
		se.save(st);
		tx.commit();

	}

}
