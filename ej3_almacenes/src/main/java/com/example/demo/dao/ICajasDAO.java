package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Cajas;

/**
 * @author Francisco
 *
 */
public interface ICajasDAO extends JpaRepository<Cajas, String>{

	// Minor test
	// public Empleados findByDNI(String dni);
	
}
