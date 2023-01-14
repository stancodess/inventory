package com.stancodes.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.stancodes.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
    
}
