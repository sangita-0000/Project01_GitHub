package com.category.product.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.category.product.demo.entity.Category;
import com.category.product.demo.service.CategoryService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;

	@PostMapping("/categories")
	public Category saveCategory(@RequestBody Category category) {
			return categoryService.saveCategory(category);
	}
	
	@GetMapping("/categories/{id}")
	public String getCategory(@PathVariable("id") Long id) {
			return categoryService.getCategory(id);
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
			return categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/categories/{id}")
	public String deleteCategory(@PathVariable("id") Long id) {
			return categoryService.deleteCategory(id);
	}
	
}
