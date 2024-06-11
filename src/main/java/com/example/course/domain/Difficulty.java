package com.example.course.domain;

public enum Difficulty {

	EASY("EASY"),MEDIUM("MEDIUM"),DIFFICULT("DIFFICULT");
	
	private String level;

	private Difficulty(String level) {
		this.level = level;
	}
	
	public static Difficulty findByDifficulty(String label) {
		for(Difficulty diff : Difficulty.values()) {
			if(diff.level.equals(label)) {
				return diff;
			}
		}
		return null;
	}
	
}
