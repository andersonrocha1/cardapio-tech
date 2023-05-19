package com.andersondev.cardapiotech.models;

import com.andersondev.cardapiotech.dto.MenuTodosDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String title;
	
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	private Double price;
	
	
	public Menu(MenuTodosDTO menuTodosDTO) {
		this.title = menuTodosDTO.getTitle();
		this.imgUrl = menuTodosDTO.getImgUrl();
		this.shortDescription = menuTodosDTO.getShortDescription();
		this.longDescription = menuTodosDTO.getLongDescription();
		this.price = menuTodosDTO.getPrice();
		
	}
	
	

}
