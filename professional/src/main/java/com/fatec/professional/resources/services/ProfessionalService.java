package com.fatec.professional.resources.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.professional.entities.Professional;
import com.fatec.professional.repositories.ProfessionalRepository;

@Service
public class ProfessionalService {
    
    @Autowired
    private ProfessionalRepository professionalRepository;

    public List<Professional> getProfessionals(){
        return professionalRepository.findAll();
    }

}
