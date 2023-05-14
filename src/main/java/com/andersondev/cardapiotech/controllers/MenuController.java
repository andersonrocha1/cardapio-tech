package com.andersondev.cardapiotech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/menus")
public class MenuController {

	
	
	@GetMapping
	public void findAll() {
		
	}
}
