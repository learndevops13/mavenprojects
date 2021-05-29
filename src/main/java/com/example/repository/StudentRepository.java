package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	/*
	 * private List<Student> student;
	 * 
	 * public StudentRepository() { student=new ArrayList<Student>();
	 * student.add(new Student(10,"Manikanta",25)); student.add(new
	 * Student(20,"Muruga",35)); student.add(new Student(30,"Vignesh",45)); } public
	 * List<Student> getAllStudnets() { return student; } public Student
	 * getStudent(@PathVariable("studentId")int studentId) { for(Student
	 * students:student) { if(students.getStudentId()==studentId) { return students;
	 * } } return null; } public boolean deleteStudent(@PathVariable("studentId")int
	 * studentId) { for(Student students:student) {
	 * if(students.getStudentId()==studentId) { return student.remove(students);
	 * //return student; } } return false; } public void saveStudent(@RequestBody
	 * Student students) { student.add(students); }
	 */
}
