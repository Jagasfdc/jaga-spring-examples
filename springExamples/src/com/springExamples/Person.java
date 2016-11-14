package com.springExamples;

public class Person {
	private int id;
	private String name;
	private Address address;
	public Person(){System.out.println("Default Constructor");}
	public Person(int id,String name,Address address){
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void show(){
		System.out.println("Id value of Person :"+id);
		System.out.println("name value of Person :"+name);
		System.out.println("address value of Person :"+address.toAdd());
	}
}
