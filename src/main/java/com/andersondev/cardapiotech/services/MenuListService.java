package com.andersondev.cardapiotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andersondev.cardapiotech.dto.MenuListDTO;
import com.andersondev.cardapiotech.models.MenuList;
import com.andersondev.cardapiotech.projections.MenuMinProjection;
import com.andersondev.cardapiotech.repositories.MenuListRepository;
import com.andersondev.cardapiotech.repositories.MenuRepository;


@Service
public class MenuListService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private MenuListRepository menuListRepository;
	
	
	@Transactional(readOnly = true)
	public List<MenuListDTO> findAll(){
		
		List<MenuList> resultMenu = menuListRepository.findAll();
		return resultMenu.stream().map(MenuListDTO::new).toList();
		
		
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {

		List<MenuMinProjection> list = menuRepository.searchByList(listId);

		MenuMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);

		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

		for (int i = min; i <= max; i++) {
			menuListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}

}
