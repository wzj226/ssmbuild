package com.gao.service.Impl;

import com.gao.dao.BookDao;
import com.gao.pojo.Books;
import com.gao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Books book) {
        return bookDao.addBooks(book);
    }

    public int deleteBookById(int id) {
        return bookDao.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookDao.queryBook(id);
    }

    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }
}
