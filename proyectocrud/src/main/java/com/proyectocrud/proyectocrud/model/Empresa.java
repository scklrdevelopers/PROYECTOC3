package com.proyectocrud.proyectocrud.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;
    private String nombre;
    private String nit; //documento
    private String telefono;
    private String direccion;

    //Una empresa tiene muchos empleados
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;

    //Una empresa tiene muchas transacciones
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<MovimientoDeDinero> movimientoDeDineros;

}
