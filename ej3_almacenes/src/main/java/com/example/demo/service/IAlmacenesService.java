package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Almacenes;

public interface IAlmacenesService {

	// Metodos del CRUD
	public List<Almacenes> listarAlmacenes(); // Listar All

	public Almacenes guardarAlmacenes(Almacenes fabricante); // CREATE

	public Almacenes almacenXID(Long id); // READ

	public Almacenes actualizarAlmacen(Almacenes almacen); // UPDATE

	public void eliminarAlmacen(Long id);// DELETE

}