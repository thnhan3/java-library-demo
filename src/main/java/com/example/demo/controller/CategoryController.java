package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;

	// get all
	@GetMapping
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@PostMapping
	public Category addCategory(@RequestBody Category category) {
		category.setId(null);
		return categoryRepository.save(category);
	}
}
