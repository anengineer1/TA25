package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Departamentos;

/**
 * @author Francisco
 *
 */
public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long>{

}
