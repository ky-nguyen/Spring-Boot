package com.crud.udemytest.repositories;

import com.crud.udemytest.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
