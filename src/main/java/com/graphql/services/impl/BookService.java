package com.graphql.services.impl;


import com.graphql.entities.Book;
import com.graphql.repository.BookRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServices {


    private BookRep bookRep;


    @Autowired
    public BookService(BookRep bookRep){
        this.bookRep=bookRep;
    }


    @Override
    public List<Book> getAll(){
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()->new RuntimeException(("Book Not Found")));
    }

    @Override
    public Book create(Book book){
        return this.bookRep.save(book);
    }


}
