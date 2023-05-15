package com.andersondev.cardapiotech.dto;

import com.andersondev.cardapiotech.models.MenuList;

public class MenuListDTO {

	private Long id;
	private String name;

	public MenuListDTO() {

	}

	public MenuListDTO(MenuList entity) {
		
		id = entity.getId();
		name = entity.getName();

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
