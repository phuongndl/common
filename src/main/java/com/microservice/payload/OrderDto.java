package com.microservice.payload;

import lombok.Data;
import java.util.*;

@Data
public class OrderDto {

	private long id;
	private List<OrderDetailDto> details;
	private String status;
	private double total;
	private long buyerId;
	private String buyerUsername;
}
