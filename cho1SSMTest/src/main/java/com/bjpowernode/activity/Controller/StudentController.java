package com.bjpowernode.activity.Controller;

import com.bjpowernode.activity.Service.StudentService;
import com.bjpowernode.activity.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/add.do")
    public ModelAndView addStudent(String name,int age){
        System.out.println("进入到学生控制器");
        ModelAndView mv = new ModelAndView();
        Student stu = new Student();
        stu.setAge(age);
        stu.setName(name);
        int count = studentService.addStudent(stu);
        if(count>0){
            mv.addObject("msg","注册成功");
            mv.setViewName("success");
        }else{
            mv.addObject("msg","注册失败，请检查原因");
            mv.setViewName("fail");
        }

        return mv;

    }


    @RequestMapping("/search.do")
    @ResponseBody
    public List<Student> searchStudent(){
        System.out.println("进入到查询控制器");
        List<Student> stuList  = studentService.searchStudentList();
            return stuList;




    }

}
