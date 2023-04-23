package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas") // en caso que la tabla sea diferente
public class Peliculas {

	// Atributos de entidad peliculas
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacionedad")
	private long calificacionedad;

	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Salas> salas;

	// Constructores
	public Peliculas() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param calificacionedad
	 */
	public Peliculas(Long id, String nombre, long calificacionedad) {
		// super();
		this.codigo = id;
		this.nombre = nombre;
		this.calificacionedad = calificacionedad;

	}

	// getter y setter
	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the articulos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
	public List<Salas> getSalas() {
		return salas;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param articulos the articulos to set
	 */
	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

	/**
	 * @return the capacidad
	 */
	public long getCalificacionedad() {
		return calificacionedad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCalificacionedad(long calificacionedad) {
		this.calificacionedad = calificacionedad;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + calificacionedad
				+ ", empleados=" + salas + "]";
	}
	
}