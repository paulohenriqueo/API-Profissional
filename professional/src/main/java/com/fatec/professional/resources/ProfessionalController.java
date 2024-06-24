package com.fatec.professional.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.professional.entities.Professional;
import com.fatec.professional.resources.services.ProfessionalService;

@RestController
@RequestMapping("professionals")
public class ProfessionalController {
    
    @Autowired
    private ProfessionalService professionalService;

    @GetMapping
    public List<Professional> getProfessionals(){

        return professionalService.getProfessionals();

    }

}
