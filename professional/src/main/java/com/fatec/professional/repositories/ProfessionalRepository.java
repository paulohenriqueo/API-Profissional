package com.fatec.professional.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.professional.entities.Professional;

public interface ProfessionalRepository extends JpaRepository<Professional,Integer> {
    
}
