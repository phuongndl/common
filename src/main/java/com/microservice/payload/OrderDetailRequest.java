package com.microservice.payload;

import lombok.Data;

@Data
public class OrderDetailRequest {
	
	private long id;
	private int quantity;
}
