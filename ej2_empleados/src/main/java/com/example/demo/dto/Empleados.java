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
@Table(name = "empleados") // en caso que la tabla sea diferente
public class Empleados {

	// Atributos de entidad Articulos
	@Id
	@Column(name = "dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamentos departamento;

	// Constructores
	/**
	 * 
	 */
	public Empleados() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 */
	public Empleados(String id, String nombre, String apellidos, Departamentos departamento) {
		// super();
		this.dni = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	/**
	 * @return the DNI
	 */
//		public String getDNI() {
//			return dni;
//		}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precio
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the fabricantes
	 */
	public Departamentos getDepartamento() {
		return departamento;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

}