package com.stackroute.spring.ioc.springdi;

public class Hobby {
	
	private int id;
	private String hobbyName;
	private int since;
	
	public Hobby(int id, String hobbyName, int since) {
		System.out.println("inside Hobby(int,String,int) constructor...");
		this.id = id;
		this.hobbyName = hobbyName;
		this.since = since;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "Hobby [id=" + id + ", hobbyName=" + hobbyName + ", since=" + since + "]";
	}
	
	public void setup() {
		System.out.println("intial setup of hobby");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
	
	
	

}
