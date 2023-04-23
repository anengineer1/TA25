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
import com.example.demo.dto.Cajas;
import com.example.demo.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceImpl CajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return CajasServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCaja(@RequestBody Cajas caja) {
		
		return CajasServiceImpl.guardarCajas(caja);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas cajaXID(@PathVariable(name="id") String id) {
		
		Cajas caja_xid= new Cajas();
		
		caja_xid=CajasServiceImpl.cajaXID(id);
		
		return caja_xid;
	}
	
	@PutMapping("/cajas/{id}")
	public Cajas actualizarCaja(@PathVariable(name="id")String id,@RequestBody Cajas caja) {
		
		Cajas caja_seleccionada= new Cajas();
		Cajas caja_actualizada= new Cajas();
		
		caja_seleccionada= CajasServiceImpl.cajaXID(id);
		
		caja_seleccionada.setContenido(caja.getContenido());
		caja_seleccionada.setValor(caja.getValor());
		caja_seleccionada.setAlmacen(caja.getAlmacen());
		
		caja_actualizada = CajasServiceImpl.actualizarCaja(caja_seleccionada);
		
		return caja_actualizada;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCaja(@PathVariable(name="id")String id) {
		CajasServiceImpl.eliminarCaja(id);
	}
	
}