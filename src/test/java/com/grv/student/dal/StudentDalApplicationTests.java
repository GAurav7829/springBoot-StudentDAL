package com.grv.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grv.student.dal.entities.Student;
import com.grv.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);
	}
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1L);
		System.out.println(student.get());
	}
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(1L).get();
		student.setFee(40d);
		studentRepository.save(student);
	}
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1L);
	}
	
}
