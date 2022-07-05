package com.pruebasunitariasnosqlspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebasunitariasnosqlspring.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro, Integer> {

}
