package com.app.vo;

import lombok.Data;

import java.util.Set;

@Data
public class AuthorVo {
	
	private String autorFirstName;
	private String authorSecondName;
	private String authorEmail;
	private Set<CourseVo> courseVo;
	


}
