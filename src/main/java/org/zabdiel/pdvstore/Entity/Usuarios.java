package org.zabdiel.pdvstore.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

//Se importa Data para el uso de loombook el cual sirve para crear los setters y getters de manera automatica
@Data
@Table(name = "usuarios")

public class Usuarios implements Serializable {


    private static final long serialVersionUID = 1L;

    //Definimos nuestra llave primaria

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idusuario;

    private String username;

    private String password;

    //mapeo entre clase hierachy y users

    @OneToMany
    @JoinColumn(name = "id_usuario_fk")

    private List<Hierarchy> hierarchyList;










}
