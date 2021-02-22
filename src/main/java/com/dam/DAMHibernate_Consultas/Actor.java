package com.dam.DAMHibernate_Consultas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	
	@Id
	private int actor_id;
	@Column
	private String nombre;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Pelicula> peliculas;
	
	public Actor() {
		
	}
	
	public Actor(int actor_id, String nombre) {
		this.actor_id = actor_id;
		this.nombre = nombre;
		this.peliculas = new ArrayList<Pelicula>();
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public void anhadirPelicula(Pelicula p) {
		peliculas.add(p);
	}
	
	

}
