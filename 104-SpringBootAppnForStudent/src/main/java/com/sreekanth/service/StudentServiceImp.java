package com.sreekanth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sreekanth.model.Student;
import com.sreekanth.repository.StudentRepo;

@Service
public class StudentServiceImp  implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null, r=null;
		tot=student.getSub1()+student.getSub2()+student.getSub3();
		p=tot/3;
		if (p>=70) {
			g="A grade";
		}
		else if (p>=60) {
			g="B grade";
		}
		else {
			g="C grade";
		}
		if (student.getSub1()>=35 && student.getSub2()>=35 && student.getSub3()>=35) {
			r="Pass";
		}
		else {
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		return repo.save(student);
	}
	
	@Override
	public void deleteStudent(int sid) {
		repo.deleteById(sid);
	}

	@Override
	public Student getStudent(int sid) {
		Student getOne = repo.findById(sid).get();
		return getOne;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = (List<Student>) repo.findAll();
		return studentList;
	}

	@Override
	public Student updateStudent(Student student) {
		int tot=0;
		double p=0.0;
		String g=null, r=null;
		tot=student.getSub1()+student.getSub2()+student.getSub3();
		p=tot/3;
		if (p>=70) {
			g="A grade";
		}
		else if (p>=60) {
			g="B grade";
		}
		else {
			g="C grade";
		}
		if (student.getSub1()>=35 && student.getSub2()>=35 && student.getSub3()>=35) {
			r="Pass";
		}
		else {
			r="Fail";
		}
		student.setTotal(tot);
		student.setPercentage(p);
		student.setGrade(g);
		student.setResult(r);
		return repo.save(student);
		
	}


}
