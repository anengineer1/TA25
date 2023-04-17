package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Salas;

public interface ISalasService {

	// Metodos del CRUD
	public List<Salas> listarSalas(); // Listar All

	public Salas guardarSala(Salas sala); // CREATE

	public Salas salaXID(long codigo); // READ

	public Salas actualizarSala(Salas sala); // UPDATE

	public void eliminarSala(long codigo);// DELETE

}