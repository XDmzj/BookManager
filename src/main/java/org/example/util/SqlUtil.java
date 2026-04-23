package org.example.util;

import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Student;

import java.io.IOException;
import java.util.function.Consumer;


@Log
public class SqlUtil {

    private static SqlSessionFactory factory;
    private static SqlSession session;
    static{
        try {
            factory =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            session = factory.openSession(true);
        } catch (IOException e) {
            log.warning("Mybatis初始化失败："+ e.getMessage());
        }
    }


    public static <T> void doSqlWork(Class<T> mapperClass, Consumer<T> consumer){
        consumer.accept(session.getMapper(mapperClass));
    }
}
