package com.app.dto;

import lombok.Data;

import java.util.List;

@Data
public class CourseDto {
	
	private String courseTitle;
	private String courseDescription;
	private AuthorDto authorDto;
	private List<SectionDto> sectionDto;
	
	

	

}
