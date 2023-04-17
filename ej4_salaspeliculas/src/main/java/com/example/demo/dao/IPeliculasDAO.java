package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Peliculas;

/**
 * @author Francisco
 *
 */
public interface IPeliculasDAO extends JpaRepository<Peliculas, Long>{

}
