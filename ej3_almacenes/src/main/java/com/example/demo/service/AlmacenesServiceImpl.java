package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenesDAO;
import com.example.demo.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {
	
	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes almacenXID(Long id) {
		
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		
		iAlmacenesDAO.deleteById(id);
		
	}

}