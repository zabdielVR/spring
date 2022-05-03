package org.zabdiel.pdvstore.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;



@Data
@Entity
@Table(name = "roles")
public class Hierarchy implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="idroles")
    private int id_rol;
    @Column(name="nombre_rol")
    private String nombre_rol;



}
