package com.andersondev.cardapiotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andersondev.cardapiotech.dto.MenuMinDTO;
import com.andersondev.cardapiotech.dto.MenuTodosDTO;
import com.andersondev.cardapiotech.models.Menu;
import com.andersondev.cardapiotech.projections.MenuMinProjection;
import com.andersondev.cardapiotech.repositories.MenuRepository;



@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;

	@Transactional(readOnly = true)
	public List<MenuMinDTO> findAll() {
		
		List<Menu> resultMenu = menuRepository.findAll();
		return resultMenu.stream().map(x -> new MenuMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public List<MenuMinDTO> findByList(Long lisId){
		
		List<MenuMinProjection> resultMenu = menuRepository.searchByList(lisId);
		return resultMenu.stream().map(x -> new MenuMinDTO(x)).toList();
				
	}
	
	@Transactional(readOnly = true)
	public MenuTodosDTO findById(Long id) {
		
		Menu resultMenu = menuRepository.findById(id).get();
		return new MenuTodosDTO(resultMenu);
				
	}

}
