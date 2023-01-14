package com.stancodes.inventory.services;

import org.springframework.http.ResponseEntity;

import com.stancodes.inventory.response.CategoryResponseRest;

public interface ICategoryService {
    
    public ResponseEntity<CategoryResponseRest> search();
}
