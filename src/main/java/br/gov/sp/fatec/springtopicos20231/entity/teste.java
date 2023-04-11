package br.gov.sp.fatec.springtopicos20231.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.BigIntTypeDescriptor;

@Entity
@Table(name = "usr_teste")
public class teste {
    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usr_senha")
   private String usr_senha; 

   @Column(name = "usr_nome")
   private String usr_nome; 

    public teste(Long id, String usr_senha, String usr_nome) {
    this.id = id;
    this.usr_senha = usr_senha;
    this.usr_nome = usr_nome;
}

    
    public teste() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUsr_senha() {
        return usr_senha;
    }


    public void setUsr_senha(String usr_senha) {
        this.usr_senha = usr_senha;
    }


    public String getUsr_nome() {
        return usr_nome;
    }


    public void setUsr_nome(String usr_nome) {
        this.usr_nome = usr_nome;
    }
    
}
