package com.gmail.phoenixjoe.dndserver.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "containers")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Container extends Item{

	@CollectionTable
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> contents = new ArrayList<Item>();

	public List<Item> getContents() {
		return contents;
	}

	public void setContents(List<Item> contents) {
		this.contents = contents;
	}
	
}
