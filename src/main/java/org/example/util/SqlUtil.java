package org.example.util;

import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

@Log
public class SqlUtil {

    private static SqlSessionFactory factory;
    static{
        try {
            factory =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            log.warning("Mybatis初始化失败："+ e.getMessage());
        }
    }
    public static SqlSession openSession(){
        return factory.openSession(true);//将自动提交开启
    }
}
