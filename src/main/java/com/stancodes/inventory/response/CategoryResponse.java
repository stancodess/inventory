package com.stancodes.inventory.response;

import java.util.List;

import com.stancodes.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
    
    private List<Category> category;
}
