package com.example.bigpetspringdata;

import com.example.bigpetspringdata.service.CrudCliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BigPetSpringDataApplication  implements CommandLineRunner {

    private final CrudCliente crudCliente;





    public BigPetSpringDataApplication(CrudCliente crudCliente) {
        this.crudCliente = crudCliente;
    }

    public static void main(String[] args) {
        SpringApplication.run(BigPetSpringDataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o que quer fazer");
        System.out.println("1 - Cliente");
        System.out.println("2 - pet");
        System.out.println("rações");

        int resp = scanner.nextInt();
        if (resp == 1){
        crudCliente.iniciar(scanner);

        }


    }

}


