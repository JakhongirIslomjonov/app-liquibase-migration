package org.example.appliquibase.componet;

import lombok.RequiredArgsConstructor;
import org.example.appliquibase.entity.Book;
import org.example.appliquibase.repo.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        bookRepository.save(new Book(1,"salim","esjamt"));
    }
}
