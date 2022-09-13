package com.proyectocrud.proyectocrud.repository;


import com.proyectocrud.proyectocrud.model.MovimientoDeDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDeDineroRepository extends JpaRepository<MovimientoDeDinero, Long> {
}
