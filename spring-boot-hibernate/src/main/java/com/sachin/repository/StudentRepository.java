package com.sachin.repository;

import com.sachin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    Student findByEmail(String email);
    Student findByPhone(String phone);
    List<Student>findByNameAndAddress(String name, String address);

    List<Student> findByAddress(String address);

    List<Student> findByAge(int age);
}
