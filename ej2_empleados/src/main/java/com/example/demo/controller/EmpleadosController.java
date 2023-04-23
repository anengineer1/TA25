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
	EmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleados salvarEmpleados(@RequestBody Empleados articulo) {
		
		return empleadosServiceImpl.guardarEmpleados(articulo);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleados empleadosXID(@PathVariable(name="id") String id) {
		
		Empleados empleado_xid= new Empleados();
		
		empleado_xid=empleadosServiceImpl.empleadoXID(id);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleados actualizarEmpleado(@PathVariable(name="id")String id,@RequestBody Empleados empleado) {
		
		Empleados empleado_seleccionado= new Empleados();
		Empleados empleado_actualizado= new Empleados();
		
		empleado_seleccionado= empleadosServiceImpl.empleadoXID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadosServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")String id) {
		empleadosServiceImpl.eliminarEmpleado(id);
	}
	
}