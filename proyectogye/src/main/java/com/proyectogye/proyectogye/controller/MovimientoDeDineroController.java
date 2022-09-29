package com.proyectogye.proyectogye.controller;

import com.proyectogye.proyectogye.model.MovimientoDeDinero;
import com.proyectogye.proyectogye.service.MovimientoDeDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovimientoDeDineroController {
    @Autowired
    MovimientoDeDineroService movimientoDeDineroService;

    @GetMapping("/movimientodedinero")
    private String verMovimientoDeDinero(Model model){
        model.addAttribute("movimientos", movimientoDeDineroService.verMovimientoDeDinero());
        return "listamovimiento";
    }

    @GetMapping("/crearmovimiento")
    private String verFormularioRegistroMovimiento(MovimientoDeDinero movimientoDeDinero){
        return "crearmovimiento";

    }

    @PostMapping("/movimientodedinero")
    private String crearMovimientoDeDinero(MovimientoDeDinero movimientoDeDinero){
        movimientoDeDineroService.crearMovimientoDeDinero(movimientoDeDinero);
        return "redirect:/movimientodedinero";

    }

     @GetMapping("/movimientodedinero/borrar/{id}")
    private String eliminarMovimientoDeDinero(@PathVariable("id")Long id){
        movimientoDeDineroService.eliminarMovimientoDeDinero(id);
        return "redirect:/movimientodedinero";

    }

    // @DeleteMapping("/movimientodedinero/{id}")
    // private void eliminarMovimientoDeDinero(@PathVariable("id")Long id){
    //     movimientoDeDineroService.eliminarMovimientoDeDinero(id);

    // }

    // @PutMapping("/movimientodedinero")
    // private void editarMovimientoDeDinero(@RequestBody MovimientoDeDinero movimientoDeDinero){
    //     movimientoDeDineroService.crearMovimientoDeDinero(movimientoDeDinero);
    // }
}
