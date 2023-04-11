package br.gov.sp.fatec.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20231.entity.teste;
import br.gov.sp.fatec.springtopicos20231.service.TesteService;

@RestController
@CrossOrigin
@RequestMapping(value = "/teste")
public class testecontroller {
    @Autowired
    private TesteService service;

    @PostMapping("/novo")
    @ResponseStatus(value = HttpStatus.CREATED)
    public teste novoTeste(@RequestBody teste teste){
return service.novoteste(teste);
    }

    @GetMapping
    public List<teste> pegarTodos(){
        return service.buscartodos();

    }
    
}
