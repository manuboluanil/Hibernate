package com.joc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetCollegeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session se = HibernateUtil.getSession();
		Query qu =se.createQuery("from MyCollege where dp=:j");
		qu.setParameter("j", "Bcom");
		List<MyCollege> clist = qu.list();
		Iterator<MyCollege> itr = clist.iterator();
		while(itr.hasNext()) {
			MyCollege mc = itr.next();
			System.out.println("Id : "+mc.getId()+" Name : "+mc.getCname()+" Department : "+mc.getDp()+" Fees : "+mc.getFees());
		}
		
		int x = 80000;
		Query qu1 = se.createQuery("update MyCollege m set m.fees="+x+" where m.dp=:g");
		//qu1.setParameter("f", 80000);
		qu1.setParameter("g", "BSc");
		Transaction tx = se.beginTransaction();
		int n =qu1.executeUpdate();
		tx.commit();
		if(n>0)
			System.out.println("Record updated successfully..!");
		else
			System.out.println("OOPS something went wrong..!");

	}

}
