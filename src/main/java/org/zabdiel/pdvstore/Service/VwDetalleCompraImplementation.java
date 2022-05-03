package org.zabdiel.pdvstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zabdiel.pdvstore.Entity.VwDetalleCompras;
import org.zabdiel.pdvstore.Repository.VwDetalleComprasRepository;

import java.util.List;

@Service
public class VwDetalleCompraImplementation implements VwDetalleComprasService{
    @Autowired
    private VwDetalleComprasRepository vwDetalleComprasRepository;

    @Override
    public List<VwDetalleCompras> listarcompras() {
        return (List<VwDetalleCompras>) vwDetalleComprasRepository.findAll();
    }
}
