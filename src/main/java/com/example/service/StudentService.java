package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@RequestMapping("/student")
	public Iterable<Student> getAllStudnets() {
		return studentRepository.findAll();
	}
	@RequestMapping("/student/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId")int studentId)
	{
		
		return studentRepository.findById(studentId);
	}
	@DeleteMapping("/student/{studentId}")
	public void deleteStudent(@PathVariable("studentId")int studentId)
	{
		
		 studentRepository.deleteById(studentId);;
	}
	@PostMapping("/student")
	public void saveStudent(@RequestBody Student students)
	{
		studentRepository.save(students);
	}

}
