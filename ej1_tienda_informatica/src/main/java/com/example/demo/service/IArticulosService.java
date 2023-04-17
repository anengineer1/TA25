package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Articulos;

public interface IArticulosService {

	// Metodos del CRUD
	public List<Articulos> listarArticulos(); // Listar All

	public Articulos guardarArticulos(Articulos articulo); // CREATE

	public Articulos articuloXID(Long id); // READ

	public Articulos actualizarArticulo(Articulos articulo); // UPDATE

	public void eliminarArticulo(Long id);// DELETE

}