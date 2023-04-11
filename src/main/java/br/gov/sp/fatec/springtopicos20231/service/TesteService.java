package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.teste;
import br.gov.sp.fatec.springtopicos20231.repository.testerep;

@Service
public class TesteService {
    @Autowired
    private testerep rep;

    public teste novoteste(teste teste){
        return rep.save(teste);
    }

    public List<teste> buscartodos() {
        return rep.findAll();
    }

    public teste buscarPorId(Long id) throws Exception {
        Optional<teste> testeOp = rep.findById(id);
        if(testeOp.isEmpty()) {
            throw new Exception("Usuário não existe!");
        }
        return testeOp.get();
    }
    
}
