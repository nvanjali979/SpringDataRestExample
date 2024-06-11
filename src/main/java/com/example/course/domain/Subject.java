package com.example.course.domain;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Subject {

	@Id
	private String id;
	
	@Column
	private String name;

	public Subject(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Subject() {}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}
	
}
