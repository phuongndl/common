package com.microservice.payload;

import lombok.Data;

@Data
public class OrderDetailDto {

	private long id;
	private long productId;
	private String productName;
	private int quantity;
	private double productPrice;
	private double subTotal;
}
