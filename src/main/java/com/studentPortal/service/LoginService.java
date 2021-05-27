package com.studentPortal.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.studentPortal.util.StudentPortalStudentFactory;
import com.studentPortal.entity.StudentPortalEntity;

public class LoginService {

    public boolean authenticateStudent(Integer studentID, String password) {
    	StudentPortalEntity student = getStudentByStudentId(studentID);          
        if(student!=null && student.getId().equals(studentID) && student.getPassword().equals(password)){
            return true;
        }else{ 
            return false;
        }
    }

    public StudentPortalEntity getStudentByStudentId(Integer studentID) {
    	SessionFactory sessionFactory = StudentPortalStudentFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        StudentPortalEntity student = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("select id,firstname,lastname,phone,email from studentp.user where id='"+studentID+"'");
            student = (StudentPortalEntity)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return student;
    }
    
    public List<StudentPortalEntity> getListOfStudents(){
        List<StudentPortalEntity> list = new ArrayList<StudentPortalEntity>();
        SessionFactory sessionFactory = StudentPortalStudentFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;        
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("select * from User").list();                        
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
