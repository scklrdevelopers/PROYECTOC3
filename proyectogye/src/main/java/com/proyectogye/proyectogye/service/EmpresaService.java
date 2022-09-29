package com.proyectogye.proyectogye.service;

import com.proyectogye.proyectogye.model.Empresa;
import com.proyectogye.proyectogye.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public void crearYActualizarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public List<Empresa> verEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;

    }

    //metodo nuevo creado para el controller verEmpresaPorId 27/09 11:12pm
    public Empresa verEmpresaPorId(Long id){
        return empresaRepository.findById(id).get();
    }

    public void eliminarEmpresa(Long id){
        empresaRepository.deleteById(id);
    }


}
