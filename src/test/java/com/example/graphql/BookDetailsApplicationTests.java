package com.example.graphql;

import com.example.graphql.bookdetails.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookDetailsApplicationTests {

    @Test
    void contextLoads() {
        Book byId = Book.getById("book-1");
        Assertions.assertEquals("Harry Potter and the Philosopher's Stone", byId.getName());
    }

}
