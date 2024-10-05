package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.example.demo.dto.MenuItemDTO;
import com.example.demo.entity.MenuItem;

@Mapper(componentModel = "spring")
public interface MenuItemMapper {

	@Mapping(source = "categoryId", target = "category.id")
	@Mapping(target = "id", ignore = true)
    MenuItem toEntity(MenuItemDTO menuItemDto);

    @Mapping(source = "category.id", target = "categoryId")
    MenuItemDTO toDto(MenuItem menuItem);
    
    @Mapping(source="categoryId", target ="category.id")
    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(MenuItemDTO dto, @MappingTarget MenuItem entity);
}

