package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MenuItemMapper;
import com.example.demo.dto.MenuItemDTO;
import com.example.demo.entity.MenuItem;
import com.example.demo.repository.MenuItemReposiory;

@Service
public class MenuItemService {
	@Autowired
	private MenuItemReposiory menuItemRepository;
	@Autowired
	private MenuItemMapper menuItemMapper;
	
	public MenuItemDTO createMenuItem(MenuItemDTO dto) {
		MenuItem entity = menuItemRepository.save(menuItemMapper.toEntity(dto));
		return menuItemMapper.toDto(entity);
	}
	
	public MenuItemDTO partialUpdate(Long id, MenuItemDTO dto) {
		MenuItem entity = menuItemRepository.findById(id).orElse(null);
		if (entity == null) {
			return null;
		}
		
		menuItemMapper.updateEntityFromDto(dto, entity);
		entity = menuItemRepository.save(entity);
		return menuItemMapper.toDto(entity);
	}
	
	public List<MenuItemDTO> getAll() {
		List<MenuItem> menuItems = menuItemRepository.findAll();
		List<MenuItemDTO> menuItemsDto =  menuItems.stream().map(item -> menuItemMapper.toDto(item)).toList();
		return menuItemsDto;
	}
	

}
