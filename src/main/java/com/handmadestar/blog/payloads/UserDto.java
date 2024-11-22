package com.handmadestar.blog.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty(message = "should not empty")
	@Size(min = 4, message = "username must be min of 4 characters")
	private String name;
	
	@Email (regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "please enter a valid email")
	private String email;
	
	@NotEmpty
	@Size(min = 6, max = 20, message = "should not empty and more than 6 characters and less than 20")
	@Pattern(regexp = "^(?=.*[0-9]+.*)(?=.*[a-zA-Z]+.*)[0-9a-zA-Z]{6,}$", message="Password must contain at least one letter, at least one number, and be longer than six charaters.")
	private String password;
	
	@NotEmpty(message = "tell me something abt ur self")
	private String about;

}
