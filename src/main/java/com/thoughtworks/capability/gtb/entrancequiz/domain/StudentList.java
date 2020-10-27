package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

/**
 * Create by 木水 on 2020/10/27.
 */
public class StudentList {
    private List<Student> students;
    private int[] formatter;

    public StudentList(List<Student> students, int[] formatter) {
        this.students = students;
        this.formatter = formatter;
    }

    public StudentList() {
    }

    public int[] getFormatter() {
        return formatter;
    }

    public void setFormatter(int[] formatter) {
        this.formatter = formatter;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
