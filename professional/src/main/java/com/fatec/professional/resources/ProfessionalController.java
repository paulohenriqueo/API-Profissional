package com.fatec.professional.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.professional.entities.Professional;

@RestController
@RequestMapping("professionals")
public class ProfessionalController {
    
    @GetMapping
    public List<Professional> getProfessionals(){

        Professional p1 = new Professional();
        p1.setId(1);
        p1.setName("Paulo");
        p1.setHour("20");
        p1.setArea("TI");

        Professional p2 = new Professional();
        p2.setId(2);
        p2.setName("Rodrigo");
        p2.setHour("20");
        p2.setArea("WEB");

        Professional p3 = new Professional();
        p3.setId(3);
        p3.setName("Sophia");
        p3.setHour("20");
        p3.setArea("UX/UI");

        ArrayList<Professional> lista = new ArrayList<Professional>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        return lista;

    }

}
