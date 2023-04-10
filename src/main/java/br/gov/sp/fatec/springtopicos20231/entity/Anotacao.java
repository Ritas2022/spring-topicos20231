package br.gov.sp.fatec.springtopicos20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ant_anotacao")
public class Anotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ant_id")
    private Long id;

    @Column(name = "ant_texto")
    private String texto;

    @Column(name = "ant_data_hora")
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "ant_usr_id")
    private Usuario usuario;

}