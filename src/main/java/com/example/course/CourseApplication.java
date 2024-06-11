package com.example.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.course.domain.Difficulty;
import com.example.course.service.CourseService;
import com.example.course.service.SubjectService;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner{

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private SubjectService subjectService;
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

	@Override
	public void run(String... args) {
		createSubjects();
		createCourse();
	}

	private void createSubjects() {
		subjectService.createSubject("110","BIOLOGY");
		subjectService.createSubject("111","CHEMISTRY");
		subjectService.createSubject("112","FINANCE");
		subjectService.createSubject("113","MARKETING");
		subjectService.createSubject("114","HUMANITIES");
		subjectService.createSubject("115","POLITICS");
	}
	
	private void createCourse() {
		
		courseService.createCourse(1,"BC",Difficulty.DIFFICULT, "BIOLOGY");
		courseService.createCourse(2,"FM",Difficulty.MEDIUM, "POLITICS");
		courseService.createCourse(3,"HP",Difficulty.EASY, "MARKETING");
		courseService.updateCourse(4);
		courseService.lookup().forEach(System.out::println);
	}

}
