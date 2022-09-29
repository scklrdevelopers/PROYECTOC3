package com.proyectogye.proyectogye.service;

import com.proyectogye.proyectogye.model.Empleado;
import com.proyectogye.proyectogye.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);

    }

    public List<Empleado> verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;

    }

    //metodo nuevo creado para el controller verEmpleadoPorId 28/09 19:00
    public Empleado verEmpleadoPorId(Long id){
        return empleadoRepository.findById(id).get();
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }


}
