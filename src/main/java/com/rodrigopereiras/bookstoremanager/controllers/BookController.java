package com.rodrigopereiras.bookstoremanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigopereiras.bookstoremanager.Dtos.MessageResponseDTO;
import com.rodrigopereiras.bookstoremanager.models.Book;
import com.rodrigopereiras.bookstoremanager.services.BookService;

@RestController
@RequestMapping("/")
public class BookController {

	public BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
		return bookService.create(book);
	}
}
