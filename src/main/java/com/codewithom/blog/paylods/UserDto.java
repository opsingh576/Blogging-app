package com.codewithom.blog.paylods;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	
	//We will use this class to transfer the data
	
	private int id;
	
	@NotEmpty
    private String name;
	
	@Email(message="Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10, message="Password must me min of 3 char and Max of 10 chars!!")
	private String password;
	
	@NotEmpty
	private String about;
	
	
	

}
