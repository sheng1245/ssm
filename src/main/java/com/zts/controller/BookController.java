package com.zts.controller;

import com.zts.pojo.Books;
import com.zts.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有的记录
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAll();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到添加页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){

        return "addBook";
    }

    //添加页面提交表单时，用来接收数据
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBooks"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到更新界面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id , Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbooks",books);
        return "updateBook";
    }

    //用来修改数据，要先将数据回显给界面
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //要绑定书的id
    @RequestMapping("/deteleBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deteleBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        System.out.println(queryBookName);
        Books books = bookService.queryBookByName(queryBookName);
        System.out.println(books);
        List<Books> list = new ArrayList<>();
        list.add(books);
        if(books==null){
            list=bookService.queryAll();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
