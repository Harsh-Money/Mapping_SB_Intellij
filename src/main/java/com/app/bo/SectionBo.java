package com.app.bo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class SectionBo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String sectionName;
	private String sectionOrder;
	@ManyToOne
	@JoinColumn(name = "course_id")
	private CourseBo courseBo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "sectionBo")
	private List<LectureBo> lectureBo;
	

	
	

}
