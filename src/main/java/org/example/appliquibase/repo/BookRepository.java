package org.example.appliquibase.repo;

import org.example.appliquibase.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}