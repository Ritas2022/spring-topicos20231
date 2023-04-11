package br.gov.sp.fatec.springtopicos20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springtopicos20231.entity.teste;

public interface testerep extends JpaRepository<teste,Long> {
    
}
