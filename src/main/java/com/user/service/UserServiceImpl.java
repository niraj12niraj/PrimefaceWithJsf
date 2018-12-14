package com.user.service;

import java.util.List;

import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.user.entity.User;

@Transactional
public class UserServiceImpl implements UserService{
	private Session session;
	private SessionFactory sessionFactory;
	private User user;

	@Override
	public void getUserById(int id) {
		// TODO Auto-generated method stub
		try {
			session=(Session) sessionFactory.acquireSession().getSessionLog();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("in Finally..getUserById");
		}
		
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateOrEditUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mergerUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
