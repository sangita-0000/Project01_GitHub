package com.category.product.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.category.product.demo.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
