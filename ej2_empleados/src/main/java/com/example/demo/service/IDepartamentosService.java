package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Departamentos;

public interface IDepartamentosService {

	// Metodos del CRUD
	public List<Departamentos> listarDepartamentos(); // Listar All

	public Departamentos guardarDepartamentos(Departamentos fabricante); // CREATE

	public Departamentos departamentosXID(Long id); // READ

	public Departamentos actualizarDepartamentos(Departamentos cliente); // UPDATE

	public void eliminarDepartamento(Long id);// DELETE

}