package com.example.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentDao extends BaseMapper<Student>{

    @Select("select * from student where FirstName = #{firstname} and Password = #{password}")
    public Student getUserByInfo(@Param("firstname") String name, @Param("password") String password);

    @Select("select * from student where FirstName = #{firstname}")
    public Student getStudentByName(String firstname);

    public void editSelfInfo(Student student);


}


























