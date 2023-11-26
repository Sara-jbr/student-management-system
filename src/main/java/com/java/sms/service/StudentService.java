package com.java.sms.service;


import com.java.sms.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
