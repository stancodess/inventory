package com.stancodes.inventory.services;

import org.springframework.http.ResponseEntity;

import com.stancodes.inventory.model.Category;
import com.stancodes.inventory.response.CategoryResponseRest;

public interface ICategoryService {
    
    public ResponseEntity<CategoryResponseRest> search();
    public ResponseEntity<CategoryResponseRest> searchById(Long id);
    public ResponseEntity<CategoryResponseRest> save(Category category);
    public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
    public ResponseEntity<CategoryResponseRest> deleteById(Long id);
}
