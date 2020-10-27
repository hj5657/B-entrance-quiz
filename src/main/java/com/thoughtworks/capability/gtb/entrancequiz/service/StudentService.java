package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by 木水 on 2020/10/27.
 */
@Service
public class StudentService {
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
        return students;
    }

    public void divideAll() {

    }

    public List<Student> getAllStudents() {
        return init();
    }
}
