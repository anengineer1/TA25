package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Fabricantes;

public interface IFabricantesService {

	// Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); // Listar All

	public Fabricantes guardarFabricante(Fabricantes fabricante); // CREATE

	public Fabricantes fabricanteXID(Long id); // READ

	public Fabricantes actualizarFabricante(Fabricantes cliente); // UPDATE

	public void eliminarFabricante(Long id);// DELETE

}