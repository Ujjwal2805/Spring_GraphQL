package com.graphql.restcontroller;

import com.graphql.entities.Book;
import com.graphql.repository.BookRep;
import com.graphql.services.impl.BookService;
import com.graphql.services.impl.BookServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.context.annotation.Import;
import org.springframework.graphql.test.tester.GraphQlTester;


@GraphQlTest(bookcontroller.class)
@Import(BookService.class)
class bookcontrollerIntTest {



    @Autowired
    GraphQlTester graphQlTester;

    @Test
    void testgetAllbooks(){
        // language=GraphQL
        String document= """
                query {
                allBooks{
                id,
                desc,
                author,
                pages,
                price
                title

                }
                }
                
                """;

        graphQlTester.document(document)
                .execute()
                .path("allBooks")
                .entityList(Book.class)
                .hasSize(2);
    }



}