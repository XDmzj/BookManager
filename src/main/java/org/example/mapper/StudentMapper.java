package org.example.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Student;

import java.util.List;


public interface StudentMapper {
    @Insert("insert into db_student (name,gender,age) values (#{name},#{gender},#{age});")
    int insertStudent(Student student);
    @Select("select * from db_student")
    List<Student> selectAllStudent();
}
