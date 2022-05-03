package org.zabdiel.pdvstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zabdiel.pdvstore.Service.VwDetalleComprasService;

@Controller
public class ControllerView {

    @Autowired

    private VwDetalleComprasService vwDetalleComprasService;
    @GetMapping("/vista")
    public String inicioVista(Model model){
        var vwDetalleCompras = vwDetalleComprasService.listarcompras();
        model.addAttribute("vwDetalleCompras",vwDetalleCompras);
        //this return to html file
        return "vista";
    }

}
