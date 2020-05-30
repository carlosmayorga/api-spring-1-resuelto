package com.cmayorga.learn.spring.service.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cmayorga.learn.spring.service.rest.model.Book;
import com.cmayorga.learn.spring.service.rest.service.BooksService;

@RestController
public class BooksController {
	
    
    @Autowired
    BooksService service;
    
    
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
	    
	    return service.findAll();
	}
	
	
	@GetMapping("/books/{id}")
        public Book findBookById(@PathVariable int id) {
        
        System.out.println(" :-) Looking for a book with id --> " + id);
        
        return service.findById(id);
    }
	

}
