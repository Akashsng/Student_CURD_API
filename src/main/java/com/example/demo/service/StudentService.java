package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentPostRequestModel;
import com.example.demo.model.StudentPostResponseModel;

@Service
public class StudentService {
	HashMap<Integer,Student> studentHM;
	public StudentPostResponseModel create(StudentPostRequestModel request) {
		if(studentHM == null) {
			studentHM = new HashMap<Integer, Student>();
		}
		Student s = new Student(request.getEmail(),request.getName(),request.getPassWord());
		s.setId(getRandomNumber());
		if(studentHM.containsKey(s.getId())) {
			s.setId(getRandomNumber());
		}
		studentHM.put(s.getId(), s);
		
		StudentPostResponseModel response = new StudentPostResponseModel(s.getId(),
				s.getName(),s.getEmail());
		
		return response;
	}
	
	public Student getStudent(int id) {
		Student student = null ;
		if(studentHM ==null) {
			
		}
		if(studentHM.containsKey(id)) {
			student =  studentHM.get(id);
		}
		return student;
	}
	
	public Student[] getStudents() {
		Student[] students = new Student[studentHM.size()];
		int i = 0 ;
		for(Student st:studentHM.values()) {
			students[i] = st;
			i++;
		}
		return students;
	}
	
	private int getRandomNumber() {
		int min  = 1,max =10000;
		return (int)((Math.random()*(max-min))+min);
	}

}
