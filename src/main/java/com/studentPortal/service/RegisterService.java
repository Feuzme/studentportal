package com.studentPortal.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.studentPortal.util.StudentPortalStudentFactory;
import com.studentPortal.entity.StudentPortalEntity;

public class RegisterService {
	
public boolean register(StudentPortalEntity student){
	SessionFactory sessionFactory = StudentPortalStudentFactory.getSessionFactory();
    Session session = sessionFactory.openSession();
	 if(isStudentExists(student)) return false;	
	 Transaction tx = null;	
	 try {
		 tx = session.getTransaction();
		 tx.begin();
		 session.saveOrUpdate(student);		
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }	
	 return true;
}

public boolean isStudentExists(StudentPortalEntity student){
	SessionFactory sessionFactory = StudentPortalStudentFactory.getSessionFactory();
    Session session = sessionFactory.openSession();
	 boolean result = false;
	 Transaction tx = null;
	 try{
		 tx = session.getTransaction();
		 tx.begin();
		 Query query = session.createQuery("from user where id='"+student.getId()+"'");
		 StudentPortalStudentFactory student_tmp = (StudentPortalStudentFactory)query.uniqueResult();
		 tx.commit();
		 if(student_tmp!=null) result = true;
	 }catch(Exception ex){
		 if(tx!=null){
			 tx.rollback();
		 }
	 }finally{
		 session.close();
	 }
	 return result;
}
}