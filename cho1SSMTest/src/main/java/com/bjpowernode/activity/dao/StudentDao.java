package com.bjpowernode.activity.dao;

import com.bjpowernode.activity.domain.Student;

import java.util.List;

public interface StudentDao {
    int addStudent(Student student);
    List<Student> searchStudentList();
}
