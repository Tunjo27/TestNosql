package com.pruebasunitariasnosqlspring.services;

import java.util.List;

import com.pruebasunitariasnosqlspring.entity.Libro;

public interface ILibroService {

	public void guardarActualizarLibro(Libro libro);

	public List<Libro> traerLibros();

	public Libro traerLibroById(int id);

	public void actualizarLibro(Libro libro, int id);

	public void deleteById(int id);

}
