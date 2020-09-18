package com.microservice.payload;

import lombok.Data;

@Data
public class UserDto {

	private long id;
	private String username;
	private String email;
	private String[] roles;
	private String[] permissions;
}
