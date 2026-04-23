package org.example.mapper;

import org.apache.ibatis.annotations.Insert;

public interface StudentMapper {
    @Insert("insert into db_student (sid,name,age) values (1,'小明',18)")
    int test();


}
