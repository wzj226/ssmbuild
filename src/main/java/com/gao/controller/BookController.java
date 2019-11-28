package com.gao.controller;


import com.gao.pojo.Books;
import com.gao.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;


    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBOOK() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book, Model model) {
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del")
    public String deleteBook(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
