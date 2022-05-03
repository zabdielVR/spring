/**
 * @author Zabdiel
 * @version 0.0
 * This class is for arquitechture model MODEL VIEW CONTROLLER(MVC)
 * Provide changes for the entity model to @Proveedores
 * */

package org.zabdiel.pdvstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.zabdiel.pdvstore.Entity.Proveedores;
import org.zabdiel.pdvstore.Service.ProveedorService;


import java.util.ArrayList;
import java.util.List;

@Controller

public class ControllerProveedor {

    private List<Proveedores> logs = new ArrayList<>();
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/proveedor")
    public String inicioProveedor(Model model){

        var proveedores = proveedorService.listarProveedores();
        model.addAttribute("proveedores",proveedores);
        //this return to html file
        return "proveedor";
    }

    @GetMapping("/agregarProveedor")
    public String agregarProveedor(Model model){
        Proveedores proveedores = new Proveedores();
        logs.add(proveedores);
        model.addAttribute("proveedores",proveedores);
        return "modificarProveedor";
    }

    @PostMapping("/guardarProveedor")
    public String guardarProveedor(Proveedores proveedores){
        proveedorService.guardar(proveedores);
        return "redirect:/proveedor";
    }

    @GetMapping("/editarProveedor/{idproveedores}")
    public String editarProveedor(Proveedores proveedores,Model model){
        proveedores = proveedorService.encontrarProveedor(proveedores);
        model.addAttribute("proveedores",proveedores);
        return "modificarProveedor";
    }

    @GetMapping("/eliminarProveedor/{idproveedores}")
    public String eliminarProveedor(Proveedores proveedores){
        proveedorService.eliminar(proveedores);
        return "redirect:/proveedor";
    }
}
