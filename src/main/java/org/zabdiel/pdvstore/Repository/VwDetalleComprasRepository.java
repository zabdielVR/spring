package org.zabdiel.pdvstore.Repository;

import org.springframework.data.repository.CrudRepository;
import org.zabdiel.pdvstore.Entity.Proveedores;
import org.zabdiel.pdvstore.Entity.VwDetalleCompras;

import java.util.List;

public interface VwDetalleComprasRepository extends CrudRepository<VwDetalleCompras, Integer> {

    //List<VwDetalleCompras> findVwDetalleComprasBy(String nombre);
}
