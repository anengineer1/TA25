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
import com.example.demo.dto.Almacenes;
import com.example.demo.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes departamento) {
		
		return almacenesServiceImpl.guardarAlmacenes(departamento);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes almacenXID(@PathVariable(name="id") Long id) {
		
		Almacenes almacen_xid = new Almacenes();
		
		almacen_xid = almacenesServiceImpl.almacenXID(id);
		
		System.out.println("Cliente XID: " + almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacenes almacen) {
		
		Almacenes almacen_seleccionado= new Almacenes();
		Almacenes almacen_actualizado= new Almacenes();
		
		almacen_seleccionado= almacenesServiceImpl.almacenXID(id);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		System.out.println("El departamento actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name="id")Long id) {
		almacenesServiceImpl.eliminarAlmacen(id);
	}

}