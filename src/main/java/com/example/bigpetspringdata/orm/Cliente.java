package com.example.bigpetspringdata.orm;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_cliente")
    private Long id;
    private String nome;
    private int idade ;

    private String cpf;

    @OneToMany (mappedBy = "cliente", cascade = CascadeType.ALL)
    private List <Pet> pet;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_racao",
            joinColumns = {@JoinColumn(name = "racao_fk")},
            inverseJoinColumns = {@JoinColumn(name = "cliente_fk")})
    private List <Racao> racao;


}
