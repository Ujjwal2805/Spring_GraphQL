package com.graphql.services.impl;

import com.graphql.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookServices {
    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);
}
