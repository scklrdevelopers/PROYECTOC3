package com.proyectogye.proyectogye.controller;

import com.proyectogye.proyectogye.model.MovimientoDeDinero;
import com.proyectogye.proyectogye.service.MovimientoDeDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoDeDineroController {
    @Autowired
    MovimientoDeDineroService movimientoDeDineroService;

    @GetMapping("/movimientodedinero")
    private List<MovimientoDeDinero> verMovimientoDeDinero(){
        return movimientoDeDineroService.verMovimientoDeDinero();
    }

    @PostMapping("/movimientodedinero")
    private void crearMovimientoDeDinero(@RequestBody MovimientoDeDinero movimientoDeDinero){
        movimientoDeDineroService.crearMovimientoDeDinero(movimientoDeDinero);

    }

    @DeleteMapping("/movimientodedinero/{id}")
    private void eliminarMovimientoDeDinero(@PathVariable("id")Long id){
        movimientoDeDineroService.eliminarMovimientoDeDinero(id);

    }

    @PutMapping("/movimientodedinero")
    private void editarMovimientoDeDinero(@RequestBody MovimientoDeDinero movimientoDeDinero){
        movimientoDeDineroService.crearMovimientoDeDinero(movimientoDeDinero);
    }
}
