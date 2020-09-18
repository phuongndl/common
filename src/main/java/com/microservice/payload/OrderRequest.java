package com.microservice.payload;

import lombok.Data;

@Data
public class OrderRequest {
	private long id;
	private long authorId;
	private String authorUsername;
	private OrderDetailRequest[] details;
	private String status;
	private String message;
}
