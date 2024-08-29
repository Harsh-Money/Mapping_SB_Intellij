package com.app.repository;

import com.app.bo.CourseBo;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<CourseBo, Integer> {

}
