package com.app.bo;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class CourseBo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String courseTitle;
	private String courseDescription;
	
	@ManyToMany(mappedBy ="courseBo",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH,CascadeType.REMOVE})
	@JsonBackReference
	private Set<AuthorBo> authorBo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "courseBo")
	private List<SectionBo> sectionBo;
	
	
	
	
	

}
