package com.example.StudentMgmt.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//List<String> arr2 = Arrays.asList("sup1", "sup2", "sup3");
	List<String> arr = new ArrayList<String>();
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot";
	}
	
	@GetMapping("/students")
	public List<String> getStudentsName() {
		return arr;
	}
	
	@PostMapping("/student")
	public List<String> addStudents(@RequestBody String studentname){
		arr.add(studentname);
		return arr;
	}	
}
