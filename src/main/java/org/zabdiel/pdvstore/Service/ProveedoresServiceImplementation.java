/**
 * @author Zabdiel
 * @version 0.0
 * This class is for category vendors
 * implements the statements to override and create the database crud
 * */

package org.zabdiel.pdvstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zabdiel.pdvstore.Entity.Proveedores;
import org.zabdiel.pdvstore.Repository.ProveedoresRepository;


import java.util.List;

@Service
public class ProveedoresServiceImplementation implements ProveedorService{

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    /**
     * This method
     * @return list of @Proveedores
     */
    @Override
    public List<Proveedores> listarProveedores() {

        return (List<Proveedores>) proveedoresRepository.findAll();
    }

    /**
     * @param proveedores
     */
    @Override
    public void guardar(Proveedores proveedores) {

        proveedoresRepository.save(proveedores);



    }

    /**
     * @param proveedores
     */
    @Override
    public void eliminar(Proveedores proveedores) {
        proveedoresRepository.delete(proveedores);
    }

    /**
     * @param proveedores
     * @return
     */
    @Override
    public Proveedores encontrarProveedor(Proveedores proveedores) {
        return proveedoresRepository.findById(proveedores.getIdproveedores()).orElse(null);
    }
}
