package com.gmail.phoenixjoe.dndserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.phoenixjoe.dndserver.service.ItemBuilderService;



@RestController
@RequestMapping(path="/test") 
public class testController {

	@Autowired private ItemBuilderService itemBuilderService;
	
	
	@GetMapping("/test1")
    public boolean test(Model model) {
		
		
		itemBuilderService.testItem();
       
		return true;
    }
	
	@GetMapping("/test2")
    public boolean test2(Model model) {
		
		
		itemBuilderService.addproptotest1();
       
		return true;
    }
	
}
