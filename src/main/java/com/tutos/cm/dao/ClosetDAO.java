package com.tutos.cm.dao;

import javax.ejb.Stateless;

import com.tutos.cm.core.Closet;
import com.tutos.cm.dao.generic.GenericDAO;

@Stateless
public class ClosetDAO extends GenericDAO<Closet> {

	public ClosetDAO() {
		super(Closet.class);
	}
	
}
