package com.graphql.config;
import com.graphql.entities.Book;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.graphql.repository.BookRep;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;


@Configuration
public class RepositoryConfig {

    private final EntityManager entityManager;

    public RepositoryConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Autowired
    BookRep bookRep;
    @Bean
    public BookRep bookRep(BookRep bookRep) {
        return this.bookRep=bookRep;
    }
}
