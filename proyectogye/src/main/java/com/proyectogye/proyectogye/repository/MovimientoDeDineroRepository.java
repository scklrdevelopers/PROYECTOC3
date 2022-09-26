package com.proyectogye.proyectogye.repository;


import com.proyectogye.proyectogye.model.MovimientoDeDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDeDineroRepository extends JpaRepository<MovimientoDeDinero, Long> {
}
