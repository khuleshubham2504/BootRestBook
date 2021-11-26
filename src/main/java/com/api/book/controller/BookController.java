package com.api.book.controller;

import com.api.book.model.Book;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {


    @GetMapping(value = "/books", produces= MediaType.APPLICATION_JSON_VALUE)
    public Book getBooks(){

        Book book=new Book();
        book.getId(2342);
        book.getTitle("Java Complete Reference");
        book.getAuthor("XYZ");
        return book;
    }
}
