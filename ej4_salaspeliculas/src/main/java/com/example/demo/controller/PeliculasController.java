package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Peliculas;
import com.example.demo.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarAlmacenes(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarAlmacenes(@RequestBody Peliculas departamento) {
		
		return peliculasServiceImpl.guardarPelicula(departamento);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas almacenXID(@PathVariable(name="id") Long id) {
		
		Peliculas pelicula_xid = new Peliculas();
		
		pelicula_xid = peliculasServiceImpl.peliculaXID(id);
		
		System.out.println("Pelicula XID: " + pelicula_xid);
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Peliculas pelicula) {
		
		Peliculas pelicula_seleccionada= new Peliculas();
		Peliculas pelicula_actualizada= new Peliculas();
		
		pelicula_seleccionada= peliculasServiceImpl.peliculaXID(id);
		
		pelicula_seleccionada.setNombre(pelicula.getNombre());
		pelicula_seleccionada.setCalificacionedad(pelicula.getCalificacionedad());
		
		pelicula_actualizada = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionada);
		
		System.out.println("La pelicula actualizada es: "+ pelicula_actualizada);
		
		return pelicula_actualizada;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")Long id) {
		peliculasServiceImpl.eliminarPelicula(id);
	}

}