package com.example.demo.dto;

import com.example.demo.entity.EStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@Builder
@ToString
public class MenuItemDTO {
	private Long id;
	private String name;
	private Double price;
	private EStatus status;
	
	private Long categoryId;
}
