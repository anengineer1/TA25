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
import com.example.demo.dto.Salas;
import com.example.demo.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSala(@RequestBody Salas caja) {
		
		return salasServiceImpl.guardarSala(caja);
	}
	
	@GetMapping("/salas/{id}")
	public Salas salaXID(@PathVariable(name="id") long id) {
		
		Salas sala_xid= new Salas();
		
		sala_xid=salasServiceImpl.salaXID(id);
		
		System.out.println("Video XID: "+sala_xid);
		
		return sala_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSala(@PathVariable(name="id")long id,@RequestBody Salas sala) {
		
		Salas sala_seleccionada= new Salas();
		Salas sala_actualizada= new Salas();
		
		sala_seleccionada= salasServiceImpl.salaXID(id);
		
		sala_seleccionada.setContenido(sala.getNombre());
		sala_seleccionada.setAlmacen(sala.getPelicula());
		
		sala_actualizada = salasServiceImpl.actualizarSala(sala_seleccionada);
		
		System.out.println("La caja actualizada es: "+ sala_actualizada);
		
		return sala_actualizada;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")long id) {
		salasServiceImpl.eliminarSala(id);
	}
	
}