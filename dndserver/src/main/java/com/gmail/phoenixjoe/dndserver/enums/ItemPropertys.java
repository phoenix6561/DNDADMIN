package com.gmail.phoenixjoe.dndserver.enums;

public enum ItemPropertys {

	DAMAGE("DAMAGE"),ATTACKBONUS("ATTACKBONUS"),DECRIPTION("DECRIPTION"),AC("AC"),WEIGHT("WEIGHT"),SPECIAL("SPECIAL"),CONTAINER("CONTAINER");
	
	
	
	
	private final String keyString;

	
	ItemPropertys(String key){
		
		keyString = key;
		
	}
	
	
	
	@Override
    public String toString() {
       
		
		return keyString;
		
		
	
	}



	
	
	
}
