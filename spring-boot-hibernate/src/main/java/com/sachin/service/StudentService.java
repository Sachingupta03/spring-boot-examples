package com.sachin.service;

import com.sachin.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudent(int id);

    List<Student> findByName(String name);

    List<Student> findByAddress(String address);

    List<Student> findByAge(int age);

}
