package com.doug.controllers;

/**
 * Created by doug on 3/21/17.
 */
public class Student {
	private int id;
	private String name;
	private int score;

	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}