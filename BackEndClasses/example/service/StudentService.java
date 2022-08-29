package com.example.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Student;

import java.util.List;

public interface StudentService extends IService<Student> {
    public Student studentLogin(String name, String password);

    public Student studentGetByName(String name);

    public void studentEditSelf(Student student);

    public List<Student> studentList();


}





























