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
@Table(name = "cajas") // en caso que la tabla sea diferente
public class Cajas {

	// Atributos de entidad Cajas
	@Id
	@Column(name = "numreferencia")
	private String numreferencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private long valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacenes almacen;

	// Constructores
	/**
	 * 
	 */
	public Cajas() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param valor
	 * @param almacen
	 */
	public Cajas(String id, String nombre, long valor, Almacenes almacen) {
		// super();
		this.numreferencia = id;
		this.contenido = nombre;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numreferencia
	 */
	public String getNumreferencia() {
		return numreferencia;
	}
	
	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @return the valor
	 */
	public long getValor() {
		return valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacenes getAlmacen() {
		return almacen;
	}

	/**
	 * @param numreferencia the numreferencia to set
	 */
	public void setNumreferencia(String numref) {
		this.numreferencia = numref;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(long valor) {
		this.valor = valor;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [numreferencia=" + numreferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

}