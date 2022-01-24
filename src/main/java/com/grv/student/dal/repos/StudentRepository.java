package com.grv.student.dal.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grv.student.dal.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
