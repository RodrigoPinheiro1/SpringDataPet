package com.example.bigpetspringdata.orm;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "racao")
public class Racao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;

    private String nome;

    private String marca;

    @ManyToMany (mappedBy = "racao",fetch = FetchType.LAZY)
    private List <Cliente> cliente;



}