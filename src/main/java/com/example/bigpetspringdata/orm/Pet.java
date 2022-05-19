package com.example.bigpetspringdata.orm;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table (name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "animaisEstimacao")
    private String animal;

    private String nome;

    private String raca;

    private double peso;

    @ManyToOne
    private Cliente cliente;

}
