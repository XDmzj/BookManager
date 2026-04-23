package org.example.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.example.entity.Book;
import org.example.entity.Student;
import org.example.mapper.BookMapper;
import org.example.mapper.StudentMapper;
import org.example.util.InputUtil;
import org.example.util.SqlUtil;

public class BookService {
    public static void addBook(){

        String title = InputUtil.nextLine("请输入要添加的书名：");
        String description = InputUtil.nextLine("请输入要添加的书籍简介：");

        Book book = new Book(0,title,description);
        SqlUtil.doSqlWork(BookMapper.class, mapper->{
            int count =  mapper.insertBook(book);
            if(count>0){
                System.out.println("书籍信息插入成功！"+ book);
            }else{
                System.err.println("插入失败！请联系管理员！");
            }
        });
    }

}
