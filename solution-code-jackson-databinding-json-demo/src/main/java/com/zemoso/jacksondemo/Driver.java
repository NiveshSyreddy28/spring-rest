package com.zemoso.jacksondemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try{
			//create object mapper
			ObjectMapper objectMapper = new ObjectMapper();

			//read JSON file and map/convert to Java POJO
			//data/sample-lite.json
			Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);

			//print first and last name
			System.out.println("First Name: " + student.getFirstName());
			System.out.println("Last name: " + student.getLastName());
			System.out.println();

			//print out address: street and city
			Address address = student.getAddress();

			System.out.println("Street: " + address.getStreet());
			System.out.println("City: " + address.getCity());
			System.out.println();

			//print the languages
			for (String language: student.getLanguages()) {

				System.out.println(language);
			}


		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
