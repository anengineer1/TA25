package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Salas;

/**
 * @author Francisco
 *
 */
public interface ISalasDAO extends JpaRepository<Salas, Long>{

	// Minor test
	// public Empleados findByDNI(String dni);
	
}
