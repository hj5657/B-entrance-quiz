package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.StudentList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create by 木水 on 2020/10/27.
 */
@Service
public class StudentService {
    private List<Student> students= new ArrayList<>();
    private String[] names = {"成吉思汗",
            "鲁班七号",
            "太乙真人",
            "钟无艳",
            "花木兰",
            "雅典娜",
            "芈月",
            "白起",
            "刘禅",
            "庄周",
            "马超",
            "刘备",
            "哪吒",
            "大乔",
            "蔡文姬"};

    private List<Student> init() {
        List<Student> students= new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            Student student = new Student(i,names[i-1]);
            students.add(student);
        }
        this.students=students;
        return this.students;
    }

    public StudentList divideAll() {
        StudentList studentList = new StudentList();
        int formatter[] = new int[6];
        Collections.shuffle(students);
        studentList.setStudents(students);
        int len=students.size()/6;
        int remainder=students.size()%6;
        for (int i=0;i<6;i++){
            formatter[i]=len;
            if (remainder > i){
                formatter[i]+=1;
            }
        }
        studentList.setFormatter(formatter);
        return studentList;
    }

    public List<Student> getAllStudents() {
        return init();
    }
}
