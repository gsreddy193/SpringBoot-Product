package com.sreekanth.service;

import java.util.List;

import com.sreekanth.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int sid);
	public Student getStudent(int sid);
	public List<Student> getAllStudents();
}
