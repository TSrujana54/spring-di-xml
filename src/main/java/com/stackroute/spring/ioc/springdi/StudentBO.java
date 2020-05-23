package com.stackroute.spring.ioc.springdi;

import java.util.List;
import java.util.Map;

public class StudentBO {
	
	private Map<Student,List<Hobby>> studentsHobbiesMap;

	public StudentBO(Map<Student, List<Hobby>> studentsHobbiesMap) {
		
		this.studentsHobbiesMap = studentsHobbiesMap;
	}
	
	

}
