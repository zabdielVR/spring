package org.zabdiel.pdvstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPolicy {
    @RequestMapping("/politicas")
    public String getPolicy(){
        return "politicas";
    }

}
