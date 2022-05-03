/**
 * @author Zabdiel
 * @version 0.0
 * This class is for category vendors
 * use lombok to create setters and getters
 * */

package org.zabdiel.pdvstore.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="proveedores")

public class Proveedores implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="idproveedores")
    private Integer idproveedores;

    @Column(name="nombre_empresa")
    private String nombreEmpresa;

    @Column(name ="nombre_ejecutivo")
    private String nombreEjecutivo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name ="correo")
    private String corre;



}
