package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Peliculas;

public interface IPeliculasService {

	// Metodos del CRUD
	public List<Peliculas> listarPeliculas(); // Listar All

	public Peliculas guardarPelicula(Peliculas pelicula); // CREATE

	public Peliculas peliculaXID(Long id); // READ

	public Peliculas actualizarPelicula(Peliculas pelicula); // UPDATE

	public void eliminarPelicula(Long id);// DELETE

}