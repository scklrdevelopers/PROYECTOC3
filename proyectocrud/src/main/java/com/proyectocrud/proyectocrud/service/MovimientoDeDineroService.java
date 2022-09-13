package com.proyectocrud.proyectocrud.service;

import com.proyectocrud.proyectocrud.model.MovimientoDeDinero;
import com.proyectocrud.proyectocrud.repository.MovimientoDeDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDeDineroService {

    @Autowired
    MovimientoDeDineroRepository movimientoDeDineroRepository;

    public void crearMovimientoDeDinero(MovimientoDeDinero movimientoDeDinero){
        movimientoDeDineroRepository.save(movimientoDeDinero);

    }

    public List<MovimientoDeDinero> verMovimientoDeDinero(){
        List<MovimientoDeDinero> movimientoDeDineros = new ArrayList<MovimientoDeDinero>();
        movimientoDeDineros.addAll(movimientoDeDineroRepository.findAll());
        return movimientoDeDineros;

    }

    public void eliminarMovimientoDeDinero(Long id){
        movimientoDeDineroRepository.deleteById(id);
    }

}
