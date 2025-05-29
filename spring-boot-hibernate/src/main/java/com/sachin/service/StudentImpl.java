package com.sachin.service;

import com.sachin.exception.StudentNotFoundException;
import com.sachin.model.Student;
import com.sachin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    //  Save new or update existing student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //  Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    //  Get student by ID (throws exception if not found)
    @Override
    public Student getStudentById(int id) {
        try {
            return studentRepository.findById(id)
                    .orElseThrow(() -> new StudentNotFoundException ("Student not found with ID: " + id));
        } catch (StudentNotFoundException e) {
            throw new RuntimeException (e);
        }
    }

    //  Delete student by ID
    @Override
    public void deleteStudent(int id) {
        if (!studentRepository.existsById(id)) {
            try {
                throw new StudentNotFoundException("Cannot delete. Student not found with ID: " + id);
            } catch (StudentNotFoundException e) {
                throw new RuntimeException (e);
            }
        }
        studentRepository.deleteById(id);
    }

    //  Search by name
    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    // Search by address
    @Override
    public List<Student> findByAddress(String address) {
        return studentRepository.findByAddress(address);
    }

    //  Search by age
    @Override
    public List<Student> findByAge(int age) {
        return studentRepository.findByAge(age);
    }
}