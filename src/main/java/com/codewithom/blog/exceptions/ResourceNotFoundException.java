package com.codewithom.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
	
	String resourseName;
	String fieldName;
	long fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName,long fieldValue)
	{
		super(String.format("%s not found with %s :%s",resourceName,fieldName,fieldValue));
		this.resourseName=resourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}
	

}
