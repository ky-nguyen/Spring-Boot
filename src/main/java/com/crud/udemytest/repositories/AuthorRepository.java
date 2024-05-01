package com.crud.udemytest.repositories;

import com.crud.udemytest.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
