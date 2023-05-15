package com.andersondev.cardapiotech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andersondev.cardapiotech.models.Menu;
import com.andersondev.cardapiotech.projections.MenuMinProjection;


public interface MenuRepository extends JpaRepository<Menu, Long> {
	
	
	@Query(nativeQuery = true, value = """
			SELECT tb_menu.id, tb_menu.title, tb_menu.img_url AS imgUrl,
			tb_menu.short_description AS shortDescription, tb_menu.price, tb_belonging.position
			FROM tb_menu
			INNER JOIN tb_belonging ON tb_menu.id = tb_belonging.menu_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<MenuMinProjection> searchByList(Long listId);

}
