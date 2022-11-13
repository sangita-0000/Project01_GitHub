package com.category.product.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.category.product.demo.entity.Category;
import com.category.product.demo.repo.CategoryRepo;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo categoryRepo;

	public Category saveCategory(Category category) {
		return categoryRepo.save(category);
	}

	public String getCategory(Long id) {
		Category category = categoryRepo.getById(id);
		return category.toString();
	}

	public Category updateCategory(Category category) {
		return categoryRepo.save(category);
	}

	public String deleteCategory(Long id) {
		categoryRepo.deleteById(id);
		return "Category deleted successfully";
	}
}
