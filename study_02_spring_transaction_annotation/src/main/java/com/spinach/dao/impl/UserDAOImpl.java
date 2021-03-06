package com.spinach.dao.impl;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.spinach.dao.UserDAO;
import com.spinach.model.User;

@Component("u") 
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User user) {
		
			Session s = sessionFactory.getCurrentSession();
			
			s.save(user);
			
		//throw new RuntimeException("exeption!");
	}

}
