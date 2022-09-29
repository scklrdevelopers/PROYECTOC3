package com.proyectogye.proyectogye.model;

import com.proyectogye.proyectogye.enums.Enum_Rol;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    //private String rolEmpleado;
    //private String empresaEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_Rol rol;

    //Muchos empleados pertenecen a una empresa

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    //Un empleado tiene muchas transacciones
    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    private List<MovimientoDeDinero> movimientoDeDineros;





}