package com.proyectocrud.proyectocrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;

    private String nombreEmpleado;
    private String correoEmpleado;
    private String rolEmpleado;
    private String empresaEmpleado;

}