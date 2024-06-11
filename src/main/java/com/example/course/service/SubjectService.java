package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.domain.Subject;
import com.example.course.repo.SubjectRepo;

@Service
public class SubjectService {

	private SubjectRepo subjectRepo;
	
	@Autowired
	public SubjectService(SubjectRepo subjectRepo) {
		this.subjectRepo = subjectRepo;
	}

	public void createSubject(String id, String name) {
		// TODO Auto-generated method stub
		subjectRepo.save(new Subject(id, name));
	}

}
