package com.dam.DAMHibernate_Consultas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pelicula {
	
	@Id
	private int pelicula_id;
	@Column
	private String titulo;
	
	public Pelicula(int pelicula_id, String titulo) {
		this.pelicula_id = pelicula_id;
		this.titulo = titulo;
	}

	public int getPelicula_id() {
		return pelicula_id;
	}

	public void setPelicula_id(int pelicula_id) {
		this.pelicula_id = pelicula_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}
