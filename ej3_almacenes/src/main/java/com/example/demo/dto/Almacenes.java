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
@Table(name = "almacenes") // en caso que la tabla sea diferente
public class Almacenes {

	// Atributos de entidad almacenes
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
	private Long codigo;
	@Column(name = "lugar")
	private String lugar;
	@Column(name = "capacidad")
	private long capacidad;

	@OneToMany(mappedBy = "almacen", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cajas> cajas;

	// Constructores
	public Almacenes() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param capacidad
	 */
	public Almacenes(Long id, String nombre, long capacidad) {
		// super();
		this.codigo = id;
		this.lugar = nombre;
		this.capacidad = capacidad;

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
	public String getLugar() {
		return lugar;
	}

	/**
	 * @return the articulos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen")
	public List<Cajas> getCajas() {
		return cajas;
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
	public void setLugar(String nombre) {
		this.lugar = nombre;
	}

	/**
	 * @param articulos the articulos to set
	 */
	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}

	/**
	 * @return the capacidad
	 */
	public long getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(long capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + lugar + ", presupuesto=" + capacidad
				+ ", empleados=" + cajas + "]";
	}
	
}