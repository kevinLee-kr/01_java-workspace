package com.hw1.model.vo;

public class Student {
	private String name; // 이름
	private String subject; // 과목
	private int score; // 점수

	// 기본 생성자
	public Student() {
	}

	// 매개변수 생성자.
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 과목
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 점수
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String information() {
		return "이름 : " + name + " / 과목 : " + subject + " / 점수 : " + score;
	}
	
}
