/**
 * @author Zabdiel
 * @version 0.0
 * This interface is for category vendors
 * import the object vendors and implemente the methods
 * */

package org.zabdiel.pdvstore.Service;

import org.zabdiel.pdvstore.Entity.Proveedores;

import java.util.List;

public interface ProveedorService {

    //Read
    public List<Proveedores> listarProveedores();

    //create
    public void guardar(Proveedores proveedores);

    //delete
    public void eliminar(Proveedores proveedores);

    //edit
    public Proveedores encontrarProveedor(Proveedores proveedores);





}
