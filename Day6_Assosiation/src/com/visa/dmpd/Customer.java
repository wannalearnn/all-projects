package com.visa.dmpd;

import java.sql.Date;

public class Customer {
	int id ; 
	int firstName ; 
	int middleName ; 
	String lastName ; 
	Date datsOfJoin ;
	
	
	public Customer() {
		//super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int firstName, int middleName, String lastName, Date datsOfJoin) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.datsOfJoin = datsOfJoin;
	} 
	
	
}
