
package com.SistemaBarberia.Barberia.controllers;

import com.SistemaBarberia.Barberia.models.services.IPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;





@Controller
@SessionAttributes("personas")
public class PersonasController {
    @Autowired
    private IPersonasService personaService;
    @RequestMapping(value ="/listar", method=RequestMethod.GET)
    public String Listar(Model model){
        model.addAttribute("Tutulo","Listado de Personas");
        model.addAttribute("personas",personaService.findAll());
        return "listar";
    }
    
}
