package com.tutos.cm.business;

import java.util.List;

import com.tutos.cm.core.Closet;

public interface ClosetFacade {

	public abstract void save(Closet closet);

	public abstract void update(Closet closet);
	
	public abstract void delete(Closet closet);

	public abstract Closet find(int entityId);

	public abstract List<Closet> findAll();
}
