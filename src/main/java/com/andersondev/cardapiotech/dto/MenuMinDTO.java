package com.andersondev.cardapiotech.dto;

import com.andersondev.cardapiotech.models.Menu;

public class MenuMinDTO {

	private Long id;

	private String title;

	private String imgUrl;

	
	private String shortDescription;
	
	private Double price;
	
	
	public MenuMinDTO() {
		
	}
	
	
    public MenuMinDTO(Menu entity) {
		
    	id = entity.getId();
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		price = entity.getPrice();
		
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


	public Double getPrice() {
		return price;
	}
    
    
	
	

}
