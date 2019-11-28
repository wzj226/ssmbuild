package com.gao.dao;

import com.gao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    int addBooks(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books queryBook(int id);

    List<Books> queryAllBook();
}
