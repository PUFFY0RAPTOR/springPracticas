package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    
    @GetMapping({"/index", "/"})
    public String mostrar(Model model){        
        
        model.addAttribute("titulo", "Productos en venta");

        return "index";
    }

}
