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
import com.example.demo.dto.Empleados;
import com.example.demo.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired
	EmpleadosServiceImpl articulosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarVideos(){
		return articulosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados salvarArticulo(@RequestBody Empleados articulo) {
		
		return articulosServiceImpl.guardarEmpleados(articulo);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleados articuloXID(@PathVariable(name="id") String id) {
		
		Empleados video_xid= new Empleados();
		
		video_xid=articulosServiceImpl.empleadoXID(id);
		
		System.out.println("Video XID: "+video_xid);
		
		return video_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados actualizarArticulo(@PathVariable(name="id")String id,@RequestBody Empleados empleado) {
		
		Empleados empleado_seleccionado= new Empleados();
		Empleados empleado_actualizado= new Empleados();
		
		empleado_seleccionado= articulosServiceImpl.empleadoXID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = articulosServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarArticulo(@PathVariable(name="id")String id) {
		articulosServiceImpl.eliminarEmpleado(id);
	}
	
}