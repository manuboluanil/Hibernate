package com.joc;

import org.hibernate.Session;

public class GetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session se =HibernateUtil.getSession();
		Student st = (Student)se.load(Student.class, new Integer(111));
		System.out.println("Student id : "+st.getId()+" Name : "+st.getName()+" Course : "+st.getCourse());
		
		Student st1 = (Student)se.get(Student.class, new Integer(222));
		System.out.println("Student id : "+st1.getId()+" Name : "+st1.getName()+" Course : "+st1.getCourse());
	}

}
