package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.example.entity.Book;

public interface BookMapper {
    @Insert("insert into db_book (title,description) values(#{title},#{description})")
    int insertBook(Book book);
}
