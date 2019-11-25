package com.gmail.phoenixjoe.dndserver.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class PropertyMap {

	@Id private long id;
	
	private String name; 
	
	private Map<String,Property> propertys;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Property> getPropertys() {
		return propertys;
	}

	public void setPropertys(Map<String, Property> propertys) {
		this.propertys = propertys;
	}
	
	
	
	
}
