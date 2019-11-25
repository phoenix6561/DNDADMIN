package com.gmail.phoenixjoe.dndserver.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PropertyMap {
	  
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Id private long id;
	
	private String name; 
	
	@CollectionTable
    @ElementCollection
    @MapKeyColumn
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
