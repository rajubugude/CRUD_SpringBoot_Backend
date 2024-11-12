package com.example.demo.controllers;


import com.example.demo.entities.Student;
import com.example.demo.repositeries.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    //get all the students
    @Autowired
    StudentRepository studentrepo;
    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){
        return studentrepo.findAll();
    }

    @GetMapping(path = "/students/{id}")
    public Student getStudentById(@PathVariable(value = "id") long id){
        return studentrepo.findById(id).get();
    }

    @PostMapping(path = "/student/add")
    public void createStudent(@RequestBody  Student student){
        studentrepo.save(student);
    }

    @PutMapping(path = "/student/update/{id}")
    public Student updateStudent(@PathVariable long id){
        Student updateStudentObj = studentrepo.findById(id).get();
        updateStudentObj.setName("ZXCV");
        updateStudentObj.setPercentage(99);
        studentrepo.save(updateStudentObj);
        return updateStudentObj;
    }

    @DeleteMapping(path = "/student/delete/{id}")
    public void deleteStudent(@PathVariable long id) {
        Student s =  studentrepo.findById(id).get();
        studentrepo.delete(s);
    }

}
