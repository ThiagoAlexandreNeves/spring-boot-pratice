package com.rodrigopereiras.bookstoremanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.rodrigopereiras.bookstoremanager.Dtos.MessageResponseDTO;
import com.rodrigopereiras.bookstoremanager.models.Book;
import com.rodrigopereiras.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	public BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@PostMapping
	public MessageResponseDTO create(Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
			.message("Book created with ID" + savedBook.getId())
			.build();
		}
}
