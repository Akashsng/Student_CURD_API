package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentPostRequestModel;
import com.example.demo.model.StudentPostResponseModel;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	@GetMapping("/test")
	public String test() {
		return "Test API Works";
	}
	
	@PostMapping("/create")
	public StudentPostResponseModel create(@RequestBody StudentPostRequestModel request) {
		return studentService.create(request);
	}
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	
	// if we want to get all the students
	
	@GetMapping("/get")
	public Student[]getStudents(){
		return studentService.getStudents();
	}
	
	

}
