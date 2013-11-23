package com.tutos.cm.core;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLOSET")
public class Closet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3515472572801032398L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int serialNumber;
	private int height;
	private int width;
	private int depth;
	private boolean isDivided;
	private int numShelves;
	
	
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean isDivided() {
		return isDivided;
	}

	public void setDivided(boolean isDivided) {
		this.isDivided = isDivided;
	}

	public int getNumShelves() {
		return numShelves;
	}

	public void setNumShelves(int numShelves) {
		this.numShelves = numShelves;
	}
	
	@Override
	public int hashCode(){
		return getSerialNumber();
	}
	
}
