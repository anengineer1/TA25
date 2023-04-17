package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricantesDAO;
import com.example.demo.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService {
	
	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricantes fabricanteXID(Long id) {
		
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		
		iFabricantesDAO.deleteById(id);
		
	}

}