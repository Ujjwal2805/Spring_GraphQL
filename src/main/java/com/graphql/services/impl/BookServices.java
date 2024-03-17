package com.graphql.services.impl;

import com.graphql.entities.Book;

import java.util.List;

public interface BookServices {
    Book create(Book book);

    List<Book> getAll();

    Book get(int bookId);
}
