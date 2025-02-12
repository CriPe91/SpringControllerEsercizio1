package com.example.SpringControllerEsercizio.repositories;


import com.example.SpringControllerEsercizio.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}
