package com.andersondev.cardapiotech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.cardapiotech.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
