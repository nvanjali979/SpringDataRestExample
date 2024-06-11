package com.example.course.domain;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String name;

	@Column
	@Enumerated
	private Difficulty difficulty;
	
	@ManyToOne
	private Subject subjects;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}

	@Override
	public int hashCode() {
		return Objects.hash(difficulty, id, name, subjects);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return difficulty == other.difficulty && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(subjects, other.subjects);
	}

	public Course(Integer id, String name, Difficulty difficulty, Subject subjects) {
		this.id = id;
		this.name = name;
		this.difficulty = difficulty;
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", difficulty=" + difficulty + ", subjects=" + subjects + "]";
	}
	
	public Course() {}
	
}
