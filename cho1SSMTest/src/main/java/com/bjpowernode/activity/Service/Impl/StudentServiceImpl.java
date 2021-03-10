package com.bjpowernode.activity.Service.Impl;

import com.bjpowernode.activity.Service.StudentService;
import com.bjpowernode.activity.dao.StudentDao;
import com.bjpowernode.activity.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int count = studentDao.addStudent(student);
        return count;
    }

    @Override
    public List<Student> searchStudentList() {
        List<Student> stuList = studentDao.searchStudentList();
        return stuList;
    }
}
