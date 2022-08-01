package com.nagarro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nagarro.domain.User;


public class UserDao {
	private SessionFactory sf;

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	
	public boolean validator(User login) {
		try {
			Session session = sf.openSession();
			User lgdb = (User) session.get(User.class, login.getUserName());
			session.close();
			if (lgdb.getPassword().equals(login.getPassword())) {
				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
