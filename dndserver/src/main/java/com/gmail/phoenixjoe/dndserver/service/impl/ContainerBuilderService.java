package com.gmail.phoenixjoe.dndserver.service.impl;

import org.springframework.stereotype.Service;

import com.gmail.phoenixjoe.dndserver.enums.ItemPropertys;
import com.gmail.phoenixjoe.dndserver.model.Item;
import com.gmail.phoenixjoe.dndserver.model.Property;

@Service
public class ContainerBuilderService {

	public void calculateWeight(Item bag) {
		
		if(checkIfContainer(bag)) {
			 for(String key : bag.getPropertys().keySet()) {
				 
				Property property = bag.getPropertys().get(key);
				 
			 }
			
		}
		
		
		
		
		
	}
	private boolean checkIfContainer(Item bag) {
		
		try {
		if(bag.getPropertys().get(ItemPropertys.CONTAINER.toString()).getValueRefrence().equals("true")) {
			
			
			
			return true;
			
			
		}
		return false;
		}catch(NullPointerException e) {
			
			return false;
		}
		
	}
	
	
}
