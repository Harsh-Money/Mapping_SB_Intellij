package com.app.vo;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class CourseVo {
	
	private String courseTitle;
	private String courseDescription;
	private Set<AuthorVo> authorVo;
	private List<SectionVo> sectionVo;


}
