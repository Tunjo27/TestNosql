package com.pruebasunitariasnosqlspring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Libro")

public class Libro {

	@Id	
	@Getter @Setter private int id;
	@Getter @Setter private String nombreLibro;
	@Getter @Setter private String nombreAutor;

	public Libro(int id, String nombreLibro, String nombreAutor) {
	}
}
