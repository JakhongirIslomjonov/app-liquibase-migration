package org.example.appliquibase.conroller;

import lombok.RequiredArgsConstructor;
import org.example.appliquibase.entity.Book;
import org.example.appliquibase.repo.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public List<Book> getAll() {

        return bookRepository.findAll();
    }

}
