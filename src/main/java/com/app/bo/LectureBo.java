package com.app.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class LectureBo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String lectureName;
	
	@ManyToOne
	@JoinColumn(name = "section_id")
	private SectionBo sectionBo;
	
	@OneToOne
	@JoinColumn(name = "resourse_id")
	private ResourseBo resourseBo;


	
}
