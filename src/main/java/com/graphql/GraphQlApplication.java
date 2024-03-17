package com.graphql;

import com.graphql.entities.Book;
import com.graphql.repository.BookRep;
import com.graphql.services.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Autowired
	BookService bookService;


	@Override
	public void run(String... args) throws Exception {



		Book b1=new Book();
		b1.setTitle("NewVook");
		b1.setAuthor("xyz");
		b1.setDesc("meri bookk");
		b1.setPages(210);
		b1.setPrice(20000);

		Book b2=new Book();
		b2.setTitle("just");
		b2.setAuthor("abv");
		b2.setDesc("okk");
		b2.setPages(421);
		b2.setPrice(54000);


		this.bookService.create(b1);
		this.bookService.create(b2);
	}
}
