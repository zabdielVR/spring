package org.zabdiel.pdvstore.Entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
@Immutable
public class VwDetalleCompras {

    @Column(name="fecha")
    private Date fecha;

    @Id
    @Column(name="idordenes_compras")
    private Integer idOrdenCompra;

    @Column(name="nombre_categoria")
    private String categoria;

    @Column(name="cantidad")
    private Integer cantidad;

    @Column(name="costo_unitario")
    private Double costoUnitario;

    @Column(name="total")
    private Double total;




}
