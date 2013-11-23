package com.tutos.cm.business;

import java.util.List;

import com.tutos.cm.core.Item;

public interface ItemFacade {
	
	public abstract void save(Item item);

	public abstract void update(Item item);

	public abstract Item find(int entityId);

	public abstract List<Item> findAll();
}
