package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticulosDAO;
import com.example.demo.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService {

	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulos() {

		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulo) {

		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos articuloXID(Long id) {

		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {

		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {

		iArticulosDAO.deleteById(id);

	}

}