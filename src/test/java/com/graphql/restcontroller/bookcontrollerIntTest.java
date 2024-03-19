package com.graphql.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

import static org.junit.jupiter.api.Assertions.*;


@GraphQlTest(bookcontroller.class)
class bookcontrollerIntTest {


    @Autowired
    GraphQlTester graphQlTester;


    void testgetAllbooks(){
        String document= """
                
                
                """;
    }



}