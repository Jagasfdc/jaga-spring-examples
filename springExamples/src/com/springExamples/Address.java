package com.springExamples;

public class Address {
	private String dno;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String country;
	public Address(String dno,String street,String locality,String city,String state,String country){
		super();
		this.dno = dno;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String toAdd(){
		return "#"+dno+","+street+","+locality+","+city+","+state+","+country;
	}
}
