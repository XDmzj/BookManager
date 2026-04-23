package org.example;

import java.util.Scanner;

public class Main {
    private static final Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("======图书管理系统======");
            System.out.println("1.录入学生信息");
            System.out.println("2.录入书籍信息");
            System.out.println("3.录入借阅信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.查询书籍信息");
            System.out.println("6.查询借阅情况");
            System.out.println("请输入功能序号（输入其他内容退出系统 ）");
            try{
                int index = scanner.nextInt();
                if(index>=1 && index<=6){
                    System.out.println("用户选择了：" + index + " 号功能");
                    System.out.println();
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