package com.andersondev.cardapiotech.dto;

import org.springframework.beans.BeanUtils;

import com.andersondev.cardapiotech.models.Menu;

public class MenuTodosDTO {

	private Long id;

	private String title;

	private String imgUrl;

	private String shortDescription;
	
	private String longDescription;

	private Double price;

	public MenuTodosDTO() {

	}

	public MenuTodosDTO(Menu entity) {
		
		BeanUtils.copyProperties(entity, this);

	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}


	public Double getPrice() {
		return price;
	}
	
	

}
