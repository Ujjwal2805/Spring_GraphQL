package com.graphql.repository;

import com.graphql.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book,Integer> {

//implementation class will be generated automatically via Spring



}
