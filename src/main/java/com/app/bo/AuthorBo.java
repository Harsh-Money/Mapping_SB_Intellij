package com.app.bo;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class AuthorBo {
	
	@Id
	@GeneratedValue
	private Integer id;

	private String autorFirstName;
	private String authorSecondName;
	private String authorEmail;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH,CascadeType.REMOVE})
	@JoinTable(name = "AUTHOR_COURSE_MAPPING",
			   joinColumns = @JoinColumn(name = "author_id"),
			   inverseJoinColumns = @JoinColumn(name = "course_id"))
	@JsonManagedReference
	private Set<CourseBo> courseBo;
	

	

}
