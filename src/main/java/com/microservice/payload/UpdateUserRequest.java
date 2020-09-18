package com.microservice.payload;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UpdateUserRequest {
	@NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
	@NotEmpty
    private Set<String> roles;
    
	@NotEmpty
    private String[] permissions;
}
