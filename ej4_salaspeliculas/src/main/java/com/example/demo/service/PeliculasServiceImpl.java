package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculasDAO;
import com.example.demo.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {
	
	@Autowired
	IPeliculasDAO iAlmacenesDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Peliculas guardarPelicula(Peliculas pelicula) {
		
		return iAlmacenesDAO.save(pelicula);
	}

	@Override
	public Peliculas peliculaXID(Long id) {
		
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		
		return iAlmacenesDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		
		iAlmacenesDAO.deleteById(id);
		
	}

}