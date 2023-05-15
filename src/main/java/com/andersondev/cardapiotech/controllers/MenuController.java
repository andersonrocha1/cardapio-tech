package com.andersondev.cardapiotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersondev.cardapiotech.dto.MenuMinDTO;
import com.andersondev.cardapiotech.dto.MenuTodosDTO;
import com.andersondev.cardapiotech.services.MenuService;

@RestController
@RequestMapping(value = "/api/menus")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping
	public List<MenuMinDTO> findAll() {

		List<MenuMinDTO> result = menuService.findAll();
		return result;

	}
	
	@GetMapping(value = "/{id}")
	public MenuTodosDTO findById(@PathVariable Long id){
		
		MenuTodosDTO result = menuService.findById(id);
		return result;
		
	}

}
