package com.sreekanth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sreekanth.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
