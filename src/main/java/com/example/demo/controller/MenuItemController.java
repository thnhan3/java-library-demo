package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MenuItemDTO;
import com.example.demo.service.MenuItemService;

@RestController
@RequestMapping("/items")
public class MenuItemController {
	@Autowired
	private MenuItemService menuItemService;
	
	@PostMapping
	public MenuItemDTO createMenuItem(@RequestBody MenuItemDTO dto) {
		return menuItemService.createMenuItem(dto);
	}
	
	@PutMapping("/{id}")
	public MenuItemDTO updateMenuItem(@PathVariable Long id, @RequestBody MenuItemDTO dto) {
		return menuItemService.partialUpdate(id, dto);
	}
	
	@GetMapping
	public List<MenuItemDTO> getAll() {
		return menuItemService.getAll();
	}
	
}
