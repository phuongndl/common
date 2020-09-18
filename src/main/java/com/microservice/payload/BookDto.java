package com.microservice.payload;

import lombok.Data;

@Data
public class BookDto {

	private long id;
	private String name;
	private String description;
	private double price;
	private int sold;
}
