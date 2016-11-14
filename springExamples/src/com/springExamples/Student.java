package com.springExamples;

public class Student {
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void displayStudent(){
		System.out.println("Hello : "+name);
	}
}
