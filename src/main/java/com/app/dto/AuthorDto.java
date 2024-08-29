package com.app.dto;

import lombok.Data;

import java.util.Set;


@Data
public class AuthorDto {
	
	private String autorFirstName;
	private String authorSecondName;
	private String authorEmail;
	private Set<CourseDto> courseDto;
	


}
