package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentosDAO;
import com.example.demo.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService {
	
	@Autowired
	IDepartamentosDAO iDepartamentosDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos departamento) {
		
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public Departamentos departamentosXID(Long id) {
		
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamentos(Departamentos departamento) {
		
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		
		iDepartamentosDAO.deleteById(id);
		
	}

}