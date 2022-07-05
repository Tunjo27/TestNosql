package com.pruebasunitariasnosqlspring.controller;

import com.pruebasunitariasnosqlspring.entity.Libro;
import com.pruebasunitariasnosqlspring.services.ILibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibroController {

	@Value("${application.environment.d}")
	public String ambiente;
	
	@Autowired
	ILibroService libroService;

	@PostMapping("/addLibro")
	public int guardarLibro(@RequestBody Libro libro) {
		libroService.guardarActualizarLibro(libro);
		return libro.getId();
	}

	@GetMapping("/findAllLibros")
	public List<Libro> traerLibros() {
		return libroService.traerLibros();
	}

	@GetMapping("/findLibro/{id}")
	public Libro traerLibroById(@PathVariable("id") int id) {
		return libroService.traerLibroById(id);
	}

	@GetMapping("/findAmbiente")
	public String traerAmbiente(String ambiente) {
		return "el ambiente es " + this.ambiente;
	}
	
	@PutMapping("/update/{id}")
	public Libro actualizarLibro(@RequestBody Libro libro) {
		libroService.guardarActualizarLibro(libro);
		return libro;
	}

	@DeleteMapping("/delete/{id}")
	public void borrarLibro(@PathVariable("id") int id) {
		libroService.deleteById(id);
	}

}
