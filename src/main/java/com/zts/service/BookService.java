package com.zts.service;

import com.zts.pojo.Books;


import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deteleBookById( int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int BookId);

    //查询所有书
    List<Books> queryAll();

    //通过书名来查询一本书
    Books queryBookByName(String bookName);

}
