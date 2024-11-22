package com.handmadestar.blog.services;

import java.util.List;

import com.handmadestar.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get all category
	List<CategoryDto> getCategories();
	
	//get one by its id
	CategoryDto getCategory(Integer categoryId);

}
