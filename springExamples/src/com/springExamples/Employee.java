package com.springExamples;

public class Employee {
	private int id;
	private String name;
	public Employee(){
		System.out.println("Default Constructores");
	}
	public Employee(int id){
		this.id = id;
	}
	public Employee(String name){
		this.name = name;
	}
	public Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	public void show(){
		System.out.println("Id Value : "+id);
		System.out.println("name Value : "+name);
	}
}
