package com.andersondev.cardapiotech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.cardapiotech.models.MenuList;

public interface MenuListRepository extends JpaRepository<MenuList, Long> {

}
