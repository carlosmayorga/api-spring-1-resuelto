package com.cmayorga.learn.spring.service.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cmayorga.learn.spring.service.rest.model.Book;

@Service
public class BooksService {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1, "Spring Boot", "In 10 Steps"));
        books.add(new Book(2, "Angular 9", "For profesionals"));
        books.add(new Book(3, "Spring Web Service", "Creating a WS"));
    }
    
    
    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        for (Book bk : books) {
            if (bk.getId() == id)
                return bk;
        }
        return null;
    }

}
