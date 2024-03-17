package com.graphql.restcontroller;


import com.graphql.entities.Book;
import com.graphql.services.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
////@RequestMapping("/graphql") we can remove this for GraphQl Mapping


public class bookcontroller {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public Book create(@RequestBody Book book){ // data will be converted from json to data obj via jackson through requestbody
        return this.bookService.create(book);
    }



//    @GetMapping("get/{bookId}")
//    //bookid is a dynamic data variable
    @QueryMapping("getBook") // and in querymapping we don;t use path variable we use argument and var name should match with query schema
    public Book getBook(@Argument int bookId){
        return this.bookService.get(bookId);
    }

//    public Book getBook(@PathVariable int bookId){
//        return this.bookService.get(bookId);
//    }


//    @GetMapping("getall")
//
//    @SchemaMapping  //Used for mutation query or subscription. but for specific query we use QueryMapping
//
    @QueryMapping("allBooks")
    public List<Book> getall(){
        System.out.println("API IS HIT");
        return this.bookService.getAll();
    }



}
