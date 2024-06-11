package com.example.course.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.course.domain.Subject;

public interface SubjectRepo extends CrudRepository<Subject,String>{

	Optional<Subject> findByName(@Param("name") String name);

}
