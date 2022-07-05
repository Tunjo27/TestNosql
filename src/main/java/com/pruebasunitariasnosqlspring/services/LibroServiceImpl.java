package com.pruebasunitariasnosqlspring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebasunitariasnosqlspring.entity.Libro;
import com.pruebasunitariasnosqlspring.repository.LibroRepository;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	public LibroRepository repo;
	
	public void guardarActualizarLibro(Libro libro) {
		repo.save(libro);
	}

	public List<Libro> traerLibros() {
		List<Libro> libro = new ArrayList<Libro>();
		repo.findAll().forEach(libro1 -> libro.add(libro1));
		return libro;
	}

	public Libro traerLibroById(int id) {
		return repo.findById(id).get();
	}
	
	public void actualizarLibro(Libro libro, int id) {
		repo.save(libro);
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}

}
