package com.app.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ResourseBo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String resourseName;
	private Double resourseSize;
	private String resourseUrl;
	@OneToOne
	@JoinColumn(name = "lecture_id")
	private LectureBo lectureBo;


}
