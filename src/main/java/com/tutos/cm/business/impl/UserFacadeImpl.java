package com.tutos.cm.business.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tutos.cm.business.UserFacade;
import com.tutos.cm.core.User;
import com.tutos.cm.dao.UserDAO;

@Stateless
public class UserFacadeImpl implements UserFacade {

	@EJB
	private UserDAO userDao;

	public User findUserByEmail(String email) {
		return userDao.findUserByEmail(email);
	}
	
}
