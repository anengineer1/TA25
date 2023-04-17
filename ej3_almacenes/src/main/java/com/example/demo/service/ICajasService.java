package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Cajas;

public interface ICajasService {

	// Metodos del CRUD
	public List<Cajas> listarCajas(); // Listar All

	public Cajas guardarCajas(Cajas caja); // CREATE

	public Cajas cajaXID(String numreferencia); // READ

	public Cajas actualizarCaja(Cajas caja); // UPDATE

	public void eliminarCaja(String numreferencia);// DELETE

}