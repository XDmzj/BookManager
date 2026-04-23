package org.example.service;

import org.example.entity.Borrow;
import org.example.entity.Student;
import org.example.mapper.BorrowMapper;
import org.example.mapper.StudentMapper;
import org.example.util.InputUtil;
import org.example.util.SqlUtil;

public class BorrowService {
    //这里写对表db_borrow的操作

    //添加元素
    public static void addBorrow(){
        int sid = InputUtil.nextInt("请输入借阅人学号：");
        int bid = InputUtil.nextInt("请输入借阅书籍编号：");
        Borrow borrow = new Borrow(sid,bid);
        SqlUtil.doSqlWork(BorrowMapper.class, mapper->{
        int count =  mapper.insertBorrow(borrow);
        if(count>0){
            System.out.println("借阅 信息插入成功！"+ borrow);
        }else{
            System.err.println("插入失败！请联系管理员！");
        }
        });
    }


}
