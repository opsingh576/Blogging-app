package com.codewithom.blog.services;

import java.util.List;

import com.codewithom.blog.paylods.CategoryDto;

public interface CategoryService {
	
	
	//Create
	
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	
	//delete
	
	public void deleteCategory(Integer categoryId);
	
	
	//get
	
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll
	
	List<CategoryDto> getCategories();
	

}
