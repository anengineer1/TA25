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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fabricantes") // en caso que la tabla sea diferente
public class Fabricantes {

	// Atributos de entidad fabricantes
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "fabricantes", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Articulos> articulos;

	// Constructores
	public Fabricantes() {

	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Fabricantes(Long id, String nombre) {
		// super();
		this.codigo = id;
		this.nombre = nombre;

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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fabricantes")
	public List<Articulos> getArticulos() {
		return articulos;
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
	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}

	// metodo toString
	@Override
	public String toString() {
		return "Fabricantes [codigo=" + codigo + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}

}