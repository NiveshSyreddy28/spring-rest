package com.zemoso.jacksondemo;

import lombok.Data;

public @Data class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public Address() {
		
	}

}
