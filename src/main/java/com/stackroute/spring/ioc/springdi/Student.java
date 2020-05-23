package com.stackroute.spring.ioc.springdi;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private int contactNo;
	//private Hobby hobby;
	
	private List<Hobby> hobbiesList;
	
	/*
	 * public Student(int id, String name, String email, int contactNo, Hobby hobby)
	 * {
	 * 
	 * this.id = id; this.name = name; this.email = email; this.contactNo =
	 * contactNo; this.hobby = hobby; }
	 */

	/*
	 * public Hobby getHobby() { return hobby; }
	 * 
	 * public void setHobby(Hobby hobby) { this.hobby = hobby; }
	 */
	
	

	public int getId() {
		return id;
	}

	public Student(int id, String name, String email, int contactNo, List<Hobby> hobbiesList) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.hobbiesList = hobbiesList;
	}

	public List<Hobby> getHobbiesList() {
		return hobbiesList;
	}

	public void setHobbiesList(List<Hobby> hobbiesList) {
		this.hobbiesList = hobbiesList;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", hobbiesList=" + hobbiesList + "]";
	}
	
	
	

}
