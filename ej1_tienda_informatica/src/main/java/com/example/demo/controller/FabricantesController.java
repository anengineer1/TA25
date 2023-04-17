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
import com.example.demo.dto.Fabricantes;
import com.example.demo.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricantesServiceImpl fabricanteServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarClientes(){
		return fabricanteServideImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarCliente(@RequestBody Fabricantes cliente) {
		
		return fabricanteServideImpl.guardarFabricante(cliente);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes clienteXID(@PathVariable(name="id") Long id) {
		
		Fabricantes fabricante_xid= new Fabricantes();
		
		fabricante_xid=fabricanteServideImpl.fabricanteXID(id);
		
		System.out.println("Cliente XID: "+fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricanteServideImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServideImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarCliente(@PathVariable(name="id")Long id) {
		fabricanteServideImpl.eliminarFabricante(id);
	}

}