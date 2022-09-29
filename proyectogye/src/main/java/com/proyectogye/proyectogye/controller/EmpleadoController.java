package com.proyectogye.proyectogye.controller;

import com.proyectogye.proyectogye.model.Empleado;
import com.proyectogye.proyectogye.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado")
    private String verEmpleado(Model model){
        model.addAttribute("empleados", empleadoService.verEmpleado());
        return "listaempleado";
    }

    @GetMapping("/agregarempleado")
    private String verFormularioDeRegistroEmpleado(Empleado empleado){
        return "agregarempleado";
    }


    @PostMapping("/empleado")
    private String crearEmpleado(Empleado empleado){
        empleadoService.crearEmpleado(empleado);
        return "redirect:/empleado";

    }

    @GetMapping("/empleado/borrar/{id}")
    private String eliminarEmpleado(@PathVariable("id")Long id){
        empleadoService.eliminarEmpleado(id);
        return "redirect:/empleado";

    }

    // @PutMapping("/empleado")
    // private void editarEmpleado(@RequestBody Empleado empleado){
    //     empleadoService.crearEmpleado(empleado);
    // }

    @GetMapping("/empleado/editar/{id}")
    private String verEmpleadoPorId(@PathVariable("id")Long id, Model model){
        Empleado empleado = empleadoService.verEmpleadoPorId(id);
        model.addAttribute("empleado", empleado);
        return "actualizar-empleado";

    }

    @PostMapping("/empleado/actualizar/{id}")
    private String editarEmpleado(@PathVariable("id") Long id, Empleado empleado){
        empleadoService.crearEmpleado(empleado);
        return "redirect:/empleado";
    }
}
