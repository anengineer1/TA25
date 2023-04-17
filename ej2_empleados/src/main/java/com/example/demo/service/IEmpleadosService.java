package com.example.demo.service;

import java.util.List;

/**
 * @author Francisco
 *
 */
import com.example.demo.dto.Empleados;

public interface IEmpleadosService {

	// Metodos del CRUD
	public List<Empleados> listarEmpleados(); // Listar All

	public Empleados guardarEmpleados(Empleados empleado); // CREATE

	public Empleados empleadoXID(String dni); // READ

	public Empleados actualizarEmpleado(Empleados empleado); // UPDATE

	public void eliminarEmpleado(String dni);// DELETE

}