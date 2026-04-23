package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.mapper.StudentMapper;
import org.example.util.SqlUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainTest {
    private static SqlSession sqlSession;
    private static StudentMapper studentMapper;
    @BeforeAll
    public static void init() {
        sqlSession = SqlUtil.openSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }
    @Test
    public void test(){
        studentMapper.test();
    }


    @AfterAll
    public static void close() {

        sqlSession.close();
    }
}
