package com.studentPortal.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.studentPortal.entity.StudentPortalEntity;

public class StudentPortalDao {


    public StudentPortalDao() {
        // TODO Auto-generated constructor stub
    }
    public StudentPortalEntity insert(StudentPortalEntity StudentPortalEntity,Session session) throws ExceptionDAO{
        if (StudentPortalEntity == null) {
            return null;
        }
        if (StudentPortalEntity.getId() == null) {
            throw new ExceptionDAO("L'entite n'a pas d'ID");
        }
        Transaction tx = session.beginTransaction();
        Long id = 0l;
        try {           
            id = (Long) session.save(StudentPortalEntity);
            
            tx.commit();    
        } catch (Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            throw new ExceptionDAO("Probleme d'insert pour l'objet " + StudentPortalEntity.getClass().getName(), e);            
        } finally {
            session.close();
        }
        
        return (StudentPortalEntity) session.get(StudentPortalEntity.class, id);
    }
    
    public StudentPortalEntity select(Session session, Long id) throws ExceptionDAO{
        StudentPortalEntity StudentPortalEntity = null;
        try {           
            StudentPortalEntity  = session.get(StudentPortalEntity.class, id);
            
            return StudentPortalEntity;         
        } catch (Exception e) {
            throw new ExceptionDAO("Probleme de select pour l'objet " + StudentPortalEntity.getClass().getName(), e);   
        } finally {
            session.close();
        }
    }
    
    public StudentPortalEntity update(StudentPortalEntity StudentPortalEntity, Session session) throws ExceptionDAO {
        if (StudentPortalEntity == null) {
            return null;
        }
        if (StudentPortalEntity.getId() == null) {
            throw new ExceptionDAO("L'entité n'a pas d'ID");
        }
        Transaction tx = session.beginTransaction();
        try {       
            session.update(StudentPortalEntity);
            
            tx.commit();                
        } catch (Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            throw new ExceptionDAO("Problème dans l'update pour l'objet " + StudentPortalEntity.getClass().getName(), e);
        }
        
        return StudentPortalEntity;
    }
}