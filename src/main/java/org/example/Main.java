package org.example;

import org.example.entity.Student;
import org.example.service.BookService;
import org.example.service.BorrowService;
import org.example.service.StudentService;
import org.example.util.InputUtil;

import java.util.Scanner;

public class Main {
    private static final String prompt = """
            ======图书管理系统======
            1.录入学生信息
            2.录入书籍信息
            3.录入借阅信息
            4.查询学生信息
            5.查询书籍信息
            6.查询借阅情况
            7.退出系统
            请输入功能序号（输入其他内容退出系统 ）
            """;
    public static void main(String[] args) {
        while (true) {
            try{
                int index = InputUtil.nextInt(prompt);
                if(index>=1 && index<=6){
                    System.out.println("用户选择了：" + index + " 号功能");
                    switch (index){
                        case 1 -> StudentService.addStundent();
                        case 2 -> BookService.addBook();
                        case 3 -> BorrowService.addBorrow();
                        case 4 -> StudentService.listStudent();
                    }

                }else {
                    break;
                }
            }catch(Exception e){
                break;
            }
        }

        System.out.println("退出成功，欢迎你下次使用本系统");

    }
}