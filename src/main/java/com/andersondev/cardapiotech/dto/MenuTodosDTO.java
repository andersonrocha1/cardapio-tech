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

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	
	

}
