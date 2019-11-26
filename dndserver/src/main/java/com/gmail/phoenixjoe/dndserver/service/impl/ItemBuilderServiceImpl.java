package com.gmail.phoenixjoe.dndserver.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.phoenixjoe.dndserver.enums.ItemPropertys;
import com.gmail.phoenixjoe.dndserver.model.Item;
import com.gmail.phoenixjoe.dndserver.model.Property;
import com.gmail.phoenixjoe.dndserver.repository.ItemRepository;
import com.gmail.phoenixjoe.dndserver.service.ItemBuilderService;

@Service
public class ItemBuilderServiceImpl implements ItemBuilderService {

@Autowired	private ItemRepository itemRepository;
	
	/* (non-Javadoc)
	 * @see com.gmail.phoenixjoe.dndserver.service.impl.ItemBuilderSErvice#testItem()
	 */
	


@Override
	public void testItem() {
		
		Item item = new Item();
		item.setName("longSword");
		Map<String, Property> propmap = item.getPropertys();
		Property prop = new Property();
		prop.setNameRefrence(ItemPropertys.DAMAGE.toString());
		prop.setValueRefrence("1d8");
		propmap.put(prop.getNameRefrence(), prop);
		item.setPropertys(propmap);
		itemRepository.save(item);
		
	}
	
	@Override
	public void addproptotest1() {
		
	Item item =	itemRepository.findById(2l).orElse(null);
	
	if(null != item) {
		Map<String, Property> propmap = item.getPropertys();
		for(String key : propmap.keySet()) {
			Property property = propmap.get(key);
			System.out.println("property : " + property.getNameRefrence() + " value : " + property.getValueRefrence());
			
		}
		
		
		Property prop = new Property();
		prop.setNameRefrence(ItemPropertys.ATTACKBONUS.toString());
		prop.setValueRefrence("0");
		propmap.put(prop.getNameRefrence(), prop);
		item.setPropertys(propmap);
		itemRepository.save(item);
		
		
	}
		
		
	}
	
	@Override
	public Item createNewItem(Item item) {
		
		
	return	itemRepository.save(item);
		
		
	}
	
	@Override
	public Item loadItem(long id) {
		
		
	return	itemRepository.findById(id).orElse(null);
		
		
	}
	
	
	
}
