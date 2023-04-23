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
import com.example.demo.dto.Articulos;
import com.example.demo.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulo(@RequestBody Articulos articulo) {
		
		return articulosServiceImpl.guardarArticulos(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos articuloXID(@PathVariable(name="id") Long id) {
		
		Articulos articulo_xid= new Articulos();
		
		articulo_xid=articulosServiceImpl.articuloXID(id);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulo(@PathVariable(name="id")Long id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articulosServiceImpl.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricantes(articulo.getFabricantes());
		
		articulo_actualizado = articulosServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarArticulo(id);
	}
	
}