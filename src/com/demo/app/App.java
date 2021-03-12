package com.demo.app;

import com.demo.beans.Candidate;

public class App {

	
	public static void main(String[] args) {
		
		Candidate candidate = new Candidate();
		
		candidate.setFirstName("John");
		candidate.setLastName("Doe");
		candidate.setCandidateId(1);
		candidate.setPhoneNumber("+91-8800997766");
		
		
		System.out.println(String.format("Candidate Id: %d ,"
										+ "First Name : %s ,"
										+ "Last Name : %s ,"
										+ "PhoneNumber : %s.",
										candidate.getCandidateId(),
										candidate.getFirstName(),
										candidate.getLastName(),
										candidate.getPhoneNumber()) 
				);
		
		
	}
	
}
