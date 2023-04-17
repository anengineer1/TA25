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
@Table(name="articulos")//en caso que la tabla sea diferente
public class Articulos {
	
	//Atributos de entidad Articulos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		@Column(name = "codigo")
		private Long codigo;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "precio")
		private int precio;
		
		@ManyToOne
	    @JoinColumn(name = "fabricante")
	    private Fabricantes fabricantes;

		//Constructores
		/**
		 * 
		 */
		public Articulos() {
			
		}

	
		/**
		 * @param id
		 * @param nombre
		 * @param precio
		 * @param fabricante
		 */
		public Articulos(Long id, String nombre, int precio, Fabricantes fabricante) {
			//super();
			this.codigo = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricantes = fabricante;
		}


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
		 * @return the precio
		 */
		public int getPrecio() {
			return precio;
		}


		/**
		 * @return the fabricantes
		 */
		public Fabricantes getFabricantes() {
			return fabricantes;
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
		 * @param precio the precio to set
		 */
		public void setPrecio(int precio) {
			this.precio = precio;
		}


		/**
		 * @param fabricantes the fabricantes to set
		 */
		public void setFabricantes(Fabricantes fabricantes) {
			this.fabricantes = fabricantes;
		}


		@Override
		public String toString() {
			return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricantes="
					+ fabricantes + "]";
		}

}