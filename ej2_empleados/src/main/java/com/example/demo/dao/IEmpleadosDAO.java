package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Empleados;

/**
 * @author Francisco
 *
 */
public interface IEmpleadosDAO extends JpaRepository<Empleados, String>{

	// Minor test
	// public Empleados findByDNI(String dni);
	
}
