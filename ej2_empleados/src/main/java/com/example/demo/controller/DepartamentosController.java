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
import com.example.demo.dto.Departamentos;
import com.example.demo.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentosServiceImpl departamentosServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServideImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamentos salvarDepartamentos(@RequestBody Departamentos departamento) {
		
		return departamentosServideImpl.guardarDepartamentos(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamentos departamentoXID(@PathVariable(name="id") Long id) {
		
		Departamentos departamento_xid= new Departamentos();
		
		departamento_xid=departamentosServideImpl.departamentosXID(id);
		
		System.out.println("Cliente XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamentos actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamentos departamento) {
		
		Departamentos departamento_seleccionado= new Departamentos();
		Departamentos departamento_actualizado= new Departamentos();
		
		departamento_seleccionado= departamentosServideImpl.departamentosXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentosServideImpl.actualizarDepartamentos(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eleiminarDepartamento(@PathVariable(name="id")Long id) {
		departamentosServideImpl.eliminarDepartamento(id);
	}

}