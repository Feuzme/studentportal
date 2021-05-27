package com.studentPortal.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Factory hibernate 5.
 *
 * @since Hibernate 5
 */
public final class StudentPortalStudentFactory {

	private static final Logger LOG = LogManager.getLogger();

	private static SessionFactory sessionFactory;

	/**
	 * Constructeur de l'objet.
	 */
	private StudentPortalStudentFactory() {
		super();
		StudentPortalStudentFactory.LOG.error("Ne pas utiliser le constructeur");
	}

	/**
	 * Recupere la session factory.
	 *
	 * @return la session factory.
	 * @since Hibernate 5
	 */
	public static synchronized SessionFactory getSessionFactory() {
		if (StudentPortalStudentFactory.sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate/hibernate.cfg.xml");
			StudentPortalStudentFactory.sessionFactory = configuration.buildSessionFactory();
		}
		return StudentPortalStudentFactory.sessionFactory;
	}
}
