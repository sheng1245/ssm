package com.zts.service;

import com.zts.dao.BookMapper;
import com.zts.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //调用dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deteleBookById(int id) {
        return bookMapper.deteleBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAll() {
        return bookMapper.queryAll();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }


}
