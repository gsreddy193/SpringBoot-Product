package com.sreekanth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sreekanth.model.Student;
import com.sreekanth.service.StudentServiceImp;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceImp service;
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/addstudent")
	public String StudentForm() {
		return "studentregister";
	}
	
	@RequestMapping("/register")
	public String save(Student student,ModelMap model) {
		@SuppressWarnings("unused")
		Student s1 = service.saveStudent(student);
		return "success";
	}
	
	@RequestMapping("viewstudent")
	public String getAll(ModelMap model) {
		model.put("students", service.getAllStudents());
		return "viewstudent";
	}
	
	@RequestMapping("/delete/{sid}")
	public String delete(@PathVariable int sid) {
		service.deleteStudent(sid);
		return "redirect:/viewstudent";
	}
	
	@RequestMapping("/update/{sid}")
	public String update(@PathVariable int sid,ModelMap model) {
		model.put("command", service.getStudent(sid));
		return "edit";
	}
	
	@RequestMapping("/editu")
	public String updatesave(Student student,ModelMap model) {
		@SuppressWarnings("unused")
		Student edit = service.updateStudent(student);
		return "redirect:/viewstudent";
	}
}
