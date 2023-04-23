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
@Table(name = "departamentos") // en caso que la tabla sea diferente
public class Departamentos {

	// Atributos de entidad fabricantes
	@Id
	@Column(name = "codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "presupuesto")
	private long presupuesto;

	@OneToMany(mappedBy = "departamento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Empleados> empleados;

	// Constructores
	public Departamentos() {

	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Departamentos(Long id, String nombre, long presupuesto) {
		// super();
		this.codigo = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;

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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
	public List<Empleados> getEmpleados() {
		return empleados;
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
	public void setArticulos(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the presupuesto
	 */
	public long getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(long presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto
				+ ", empleados=" + empleados + "]";
	}
	
}