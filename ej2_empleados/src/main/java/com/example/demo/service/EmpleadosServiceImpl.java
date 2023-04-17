package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadosDAO;
import com.example.demo.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService {

	@Autowired
	IEmpleadosDAO iArticulosDAO;

	@Override
	public List<Empleados> listarEmpleados() {

		return iArticulosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleados(Empleados articulo) {

		return iArticulosDAO.save(articulo);
	}

	@Override
	public Empleados empleadoXID(String dni) {

		return iArticulosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleado(Empleados articulo) {

		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarEmpleado(String dni) {

		iArticulosDAO.findById(dni);

	}

}