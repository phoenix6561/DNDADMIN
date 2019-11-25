package com.gmail.phoenixjoe.dndserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Property {

	
	
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Id private long id;
private String NameRefrence;
private String KeyRefrence;
private String ValueRefrence;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNameRefrence() {
	return NameRefrence;
}
public void setNameRefrence(String nameRefrence) {
	NameRefrence = nameRefrence;
}
public String getKeyRefrence() {
	return KeyRefrence;
}
public void setKeyRefrence(String keyRefrence) {
	KeyRefrence = keyRefrence;
}
public String getValueRefrence() {
	return ValueRefrence;
}
public void setValueRefrence(String valueRefrence) {
	ValueRefrence = valueRefrence;
}



}
