package com.gmail.phoenixjoe.dndserver.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class PropertyMap {
	  
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Id private long id;
	
	private String name; 
	
	@CollectionTable
	@OneToMany(cascade = CascadeType.ALL)
	private Map<String,Property> propertys = new HashMap<String,Property>();

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
