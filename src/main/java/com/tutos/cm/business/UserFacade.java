package com.tutos.cm.business;

import com.tutos.cm.core.User;

public interface UserFacade {
	
	public User findUserByEmail(String email);
}
