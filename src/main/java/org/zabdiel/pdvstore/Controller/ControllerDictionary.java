package org.zabdiel.pdvstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerDictionary {

    @RequestMapping("/dictionary")
    public String getPolicy(){
        return "dictionary";
    }

}
