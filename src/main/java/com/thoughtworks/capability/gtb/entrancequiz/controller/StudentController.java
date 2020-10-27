package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.StudentList;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by 木水 on 2020/10/27.
 */
@RestController
@CrossOrigin(origins = "http://localhost:1234")
public class StudentController {
    final private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("studentList")
    public ResponseEntity getDivideStudents() {
        StudentList studentList = studentService.divideAll();
        return ResponseEntity.ok(studentList);
    }
}
