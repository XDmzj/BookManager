package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.example.entity.Borrow;

public interface BorrowMapper {
    //这里写Sql语句

    @Insert("insert into db_borrow (sid,bid) values(#{sid},#{bid})")
    int insertBorrow(Borrow borrow);
}
