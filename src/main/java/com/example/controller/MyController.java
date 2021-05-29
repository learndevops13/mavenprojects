package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class MyController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/student")
	public Iterable<Student> getAllStudnets() {
		return studentService.getAllStudnets();
	}
	@RequestMapping("/student/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId")int studentId)
	{
		
		return studentService.getStudent(studentId);
	}
	@DeleteMapping("/student/{studentId}")
	public void deleteStudent(@PathVariable("studentId")int studentId)
	{
		
	 studentService.deleteStudent(studentId);
	}
	@PostMapping("/student")
	public void saveStudent(@RequestBody Student students)
	{
		studentService.saveStudent(students);
	}
}
