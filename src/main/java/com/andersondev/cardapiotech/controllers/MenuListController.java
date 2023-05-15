package com.andersondev.cardapiotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersondev.cardapiotech.dto.MenuListDTO;
import com.andersondev.cardapiotech.dto.MenuMinDTO;
import com.andersondev.cardapiotech.dto.ReplacementDTO;
import com.andersondev.cardapiotech.services.MenuListService;
import com.andersondev.cardapiotech.services.MenuService;




@RestController
@RequestMapping(value = "/api/listmenus")
public class MenuListController {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private MenuListService menuListService;
	
	
	@GetMapping
	public List<MenuListDTO> findAll(){
		
		List<MenuListDTO> result = menuListService.findAll();
		return result;
		
	}
	
	
	@GetMapping(value = "/{listId}/menus")
	public List<MenuMinDTO> findByList(@PathVariable Long listId){
		
		List<MenuMinDTO> result = menuService.findByList(listId);
		return result;
		
	}
	
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		menuListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}

}
