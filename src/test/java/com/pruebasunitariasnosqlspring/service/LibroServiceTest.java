package com.pruebasunitariasnosqlspring.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pruebasunitariasnosqlspring.entity.Libro;
import com.pruebasunitariasnosqlspring.repository.LibroRepository;
import com.pruebasunitariasnosqlspring.services.LibroServiceImpl;

import java.util.Arrays;

public class LibroServiceTest {

	@Mock //mockeo para traer lo que se utilizaba en el service
	private LibroRepository repo;
	
	@InjectMocks
	private LibroServiceImpl libroServiceImpl;
	
	private Libro libro;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);//inicializar mockito
		libro = new Libro(1, "", "");
	}

	@Test
	void cuandoEncuentreTodosLosLibros() {
		when(repo.findAll()).thenReturn(Arrays.asList(libro));
		assertNotNull(libroServiceImpl);
	}
	
}
