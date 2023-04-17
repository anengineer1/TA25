package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas") // en caso que la tabla sea diferente
public class Salas {

	// Atributos de entidad Cajas
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
	private String codigo;
	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula")
	private Peliculas pelicula;

	// Constructores
	/**
	 * 
	 */
	public Salas() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param pelicula
	 */
	public Salas(String id, String nombre, Peliculas pelicula) {
		// super();
		this.codigo = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the pelicula
	 */
	public Peliculas getPelicula() {
		return pelicula;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.nombre = contenido;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Peliculas almacen) {
		this.pelicula = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [numreferencia=" + codigo + ", contenido=" + nombre + ", almacen=" + pelicula + "]";
	}

}