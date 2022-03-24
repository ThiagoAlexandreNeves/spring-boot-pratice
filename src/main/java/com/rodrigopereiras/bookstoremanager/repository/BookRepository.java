package com.rodrigopereiras.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigopereiras.bookstoremanager.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
