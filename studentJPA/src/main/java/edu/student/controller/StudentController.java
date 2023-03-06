package edu.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.student.entity.Student;
import edu.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	// create a new student
	@PostMapping(value = "/student")
	public Student create(@RequestBody Student student) {
		return studentService.createStudent(student);

	}

	// get all existing students
	@GetMapping(value = "/student")
	public List<Student> getAll() {
		return studentService.getAllStudents();

	}

}
