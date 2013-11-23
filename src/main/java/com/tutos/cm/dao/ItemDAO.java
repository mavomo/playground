package com.tutos.cm.dao;

import javax.ejb.Stateless;

import com.tutos.cm.core.Item;
import com.tutos.cm.dao.generic.GenericDAO;

@Stateless
public class ItemDAO extends GenericDAO<Item>{

	public ItemDAO() {
		super(Item.class);		
	}

}
