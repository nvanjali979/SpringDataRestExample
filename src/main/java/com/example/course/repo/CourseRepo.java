package com.example.course.repo;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.course.domain.Course;

public interface CourseRepo extends PagingAndSortingRepository<Course,Integer>{

	Page<Course> findBySubjectsName(@Param("name") String name, Pageable pageable);
	
	@RestResource(exported=false)
	void deleteById(@Param("id") Integer id);

	@RestResource(exported=false)
	Long count();

	@RestResource(exported=false)
	Course save(Course course);

	Optional<Course> findById(Integer id);

	Iterable<Course> findAll();
}
