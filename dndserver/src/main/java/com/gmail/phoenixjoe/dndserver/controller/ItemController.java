package com.gmail.phoenixjoe.dndserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.phoenixjoe.dndserver.model.Item;
import com.gmail.phoenixjoe.dndserver.service.ItemBuilderService;




@RestController
@RequestMapping(path="/item") 
public class ItemController {
	
	@Autowired private ItemBuilderService itemBuilderService;
	
	@PostMapping(value = "/createItem")
	@ResponseBody
	public Item createNewItem(@RequestBody Item item) {
		
		return itemBuilderService.createNewItem(item);
		
	
	}
	
	
	

	
	
	
}
