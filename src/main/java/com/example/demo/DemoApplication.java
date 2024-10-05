package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.MenuItemDTO;
import com.example.demo.entity.Category;
import com.example.demo.entity.EStatus;
import com.example.demo.entity.MenuItem;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoApplication { // implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private MenuItemMapper menuItemMapper;
	
//
//	@Override
//	public void run(String... args) throws Exception {
//		Category category = Category.builder().id(1L).name("loai a").description("desc a").build();
//		
//		MenuItem entity = MenuItem.builder().id(1L)
//				.category(category)
//				.price(2.0)
//				.name("a")
//				.status(EStatus.valueOf("A"))
//				.build();
//		
//		MenuItemDTO dto = menuItemMapper.toDto(entity);
//		
//		log.info("entity {}", entity);
//		log.info("menu item dto {}", dto);
//		
//	}

}
