package com.fatec.professional.resources.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.professional.dto.ProfessionalResponse;
import com.fatec.professional.entities.Professional;
import com.fatec.professional.mappers.ProfessionalMapper;
import com.fatec.professional.repositories.ProfessionalRepository;

@Service
public class ProfessionalService {
    
    @Autowired
    private ProfessionalRepository professionalRepository;

    public List<ProfessionalResponse> getProfessionals(){

        List <Professional> professionals = professionalRepository.findAll();

        return professionals.stream().map(p -> ProfessionalMapper.toTDO(p))
                                    .collect(Collectors.toList());
                                    
    }
    }

}
