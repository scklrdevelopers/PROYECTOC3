package com.proyectocrud.proyectocrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class MovimientoDeDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    private double monto;
    private String concepto;
    //private String encargado;

    //Muchas transacciones son de un empleado
    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    //Muchas transacciones las hace una empresa
    @ManyToOne
    @JoinColumn(name="empresa_id")
    private  Empresa empresa;
}
