package com.example.SpringControllerEsercizio.repositories;

import com.example.SpringControllerEsercizio.entities.Author;
import com.example.SpringControllerEsercizio.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
    List<Blogpost> findByAuthor(Author author);
}