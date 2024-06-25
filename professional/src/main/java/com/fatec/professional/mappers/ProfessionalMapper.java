package com.fatec.professional.mappers;

import com.fatec.professional.dto.ProfessionalRequest;
import com.fatec.professional.dto.ProfessionalResponse;
import com.fatec.professional.entities.Professional;

public class ProfessionalMapper {
    
    public static Professional toEntity(ProfessionalRequest request){

        Professional professional = new Professional();
        professional.setName(request.name());
        professional.setHour(request.hourlyRate());
        professional.setArea(request.area());

        return professional;
    }

    public static ProfessionalResponse toTDO(Professional professional){
        return new ProfessionalResponse(professional.getId(), professional.getName(),
                                        professional.getHour(), professional.getArea());
    }

}
