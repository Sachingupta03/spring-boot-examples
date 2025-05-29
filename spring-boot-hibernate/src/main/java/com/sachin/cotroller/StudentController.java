package com.sachin.cotroller;

import com.sachin.model.Student;
import com.sachin.service.StudentImpl;
import com.sachin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    private Student Student;

    @PostMapping("/add")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student saved = studentService.saveStudent(student);
        return new ResponseEntity<> (saved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Integer id){

        return studentService.getStudentById (id);
    }
}
