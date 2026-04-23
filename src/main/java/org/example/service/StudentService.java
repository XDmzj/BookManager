package org.example.service;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.util.InputUtil;
import org.example.util.SqlUtil;

import java.util.List;

public class StudentService {
    public static void addStundent(){

        String name = InputUtil.nextLine("请输入要添加的学生名：");
        String gender = InputUtil.nextLine("请输入要添加的学生性别：","男","女");
        int age = InputUtil.nextInt("请输入学生年龄：");


        Student student = new Student(1,name,gender,age);
        SqlUtil.doSqlWork(StudentMapper.class, mapper->{
            int count =  mapper.insertStudent(student);
            if(count>0){
                System.out.println("学生信息插入成功！"+ student);
            }else{
                System.err.println("插入失败！请联系管理员！");
            }
        });
    }

    public static void listStudent(){
        SqlUtil.doSqlWork(StudentMapper.class, mapper->{
            List<Student> students = mapper.selectAllStudent();
            if(!students.isEmpty()){

                String format = "%s   %s    %s   %s\n";
                String format1 = "%s     %s  %s    %s\n";
                System.out.printf(format,"学号","姓名","性别","年龄");
                students.forEach(student ->{
                    System.out.printf(format1,student.getSid(),student.getName(),student.getGender(),student.getAge());
                });

            }else{
                System.err.println("系统中没有任何学生信息！");
            }


        });
    }
}
