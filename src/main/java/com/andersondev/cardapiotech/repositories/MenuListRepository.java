package com.andersondev.cardapiotech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.andersondev.cardapiotech.models.MenuList;

public interface MenuListRepository extends JpaRepository<MenuList, Long> {

	
	@Modifying
	@Query(nativeQuery = true, 
		value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND menu_id = :menuId")
	void updateBelongingPosition(Long listId, Long menuId, Integer newPosition);

}
