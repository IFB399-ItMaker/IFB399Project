package com.example.service.Imp;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp extends ServiceImpl<StudentDao,Student> implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student studentLogin(String name, String password) {
        return studentDao.getUserByInfo(name, password);
    }

    @Override
    public Student studentGetByName(String name) {
        return studentDao.getStudentByName(name);
    }

    @Override
    public void studentEditSelf(Student student) {
         studentDao.editSelfInfo(student);
    }

    @Override
    public List<Student> studentList() {
        return studentDao.selectList(null);
    }
}





























