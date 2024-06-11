package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.domain.Course;
import com.example.course.domain.Difficulty;
import com.example.course.repo.CourseRepo;
import com.example.course.repo.SubjectRepo;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private SubjectRepo subjectRepo;

	
	public CourseService(CourseRepo courseRepo, SubjectRepo subjectRepo) {
		this.courseRepo = courseRepo;
		this.subjectRepo = subjectRepo;
	}

	public Long getCount() {
		return courseRepo.count();
	}

	// POST
	public void createCourse(int id, String name, Difficulty difficulty, String subjectName) {
		// TODO Auto-generated method stub
		courseRepo.save(new Course(id,name,difficulty,subjectRepo.findByName(subjectName).get()));
	}
	
	// PUT - creates if does not exist else updates
	public Course updateCourse(Integer id) {
		return courseRepo.findById(id).orElse(courseRepo.save(new Course(id,"HM",Difficulty.EASY,subjectRepo.findByName("HUMANITIES").get())));
	}
	
	public Iterable<Course> lookup() {
		return courseRepo.findAll();
	}
}
