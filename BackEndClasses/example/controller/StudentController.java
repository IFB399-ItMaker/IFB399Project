package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Student;
import com.example.service.Imp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @RequestMapping("/login")
    @ResponseBody
    public R<Student> studentLogin(@RequestBody Student student) {
        Student stu = studentServiceImp.studentLogin(student.getFirstname(), student.getPassword());
        if (stu != null) {
            return R.success(stu);
        } else return R.error("invalid info");
    }

    @RequestMapping("/logout")
    @ResponseBody
    public R<String> studentLogout(){
        return R.success("exit success");
    }


    @RequestMapping("/editInfo")
    @ResponseBody
    public R<Student> studentEditInfo(@RequestBody Student student){
        studentServiceImp.studentEditSelf(student);
        return R.success(student);
    }

    @RequestMapping("/showInfo")
    @ResponseBody
    public R<List<Student>> studentShowInfo(){
        List<Student> students = studentServiceImp.studentList();
        return R.success(students);
    }

    @RequestMapping("/pagination")
    @ResponseBody
    public R<Page> studentPagination(Integer currentPage, Integer pageSize, @RequestParam List<String> checkList, @RequestBody Student student){
        System.out.println(student);
        System.out.println("checkList: " + checkList + " " + checkList.toString() + " " + checkList.isEmpty());
        Page page = new Page(currentPage,pageSize);
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();

        if(!checkList.isEmpty()){
            for (String s : checkList) {
                System.out.println("s: " + s);
                queryWrapper.like("skills",s);
            }
        }


        if("All".equals(student.getMajor())){
            studentServiceImp.page(page,queryWrapper);
        }else{
            queryWrapper.eq("Major",student.getMajor());
            studentServiceImp.page(page,queryWrapper);
        }
        return R.success(page);



    }


}
