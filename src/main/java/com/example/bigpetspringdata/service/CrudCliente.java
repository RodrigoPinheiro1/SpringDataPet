package com.example.bigpetspringdata.service;

import com.example.bigpetspringdata.orm.Cliente;
import com.example.bigpetspringdata.orm.Pet;
import com.example.bigpetspringdata.repository.ClienteRepository;
import com.example.bigpetspringdata.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudCliente {

    private ClienteRepository clienteRepository;
    private PetRepository petRepository;

    public CrudCliente(ClienteRepository clienteRepository, PetRepository petRepository) {
        this.clienteRepository = clienteRepository;
        this.petRepository = petRepository;
    }

    public void iniciar(Scanner scanner) {

        System.out.println("digite sua preferencia");
        System.out.println("1 - salvar ");
        System.out.println("2 - atualizar");
        System.out.println("3- excluir");
        System.out.println("4 - procurar ");

        int resp = scanner.nextInt();

        if (resp == 1) {

            salvar(scanner);
        }


    }

    private void salvar(Scanner scanner) {
        System.out.println("digite o nome do cliente");
        String nome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite o cpf");
        String cpf = scanner.next();

        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setIdade(idade);
        cliente.setCpf(cpf);
        clienteRepository.save(cliente);

        System.out.println("deseja salvar um pet? digite sim ou não");
        String opcao = scanner.next();

        if (opcao.equalsIgnoreCase("sim")) {

            System.out.println("qual animal é?");
            String animal = scanner.next();

            System.out.println("digite o nome do animal");
            String nomeAnimal = scanner.next();

            System.out.println("digite a raça");
            String raca = scanner.next();

            System.out.println("digite o peso");
            double peso = scanner.nextDouble();

          /*  Pet pet = new Pet();

            pet.setAnimal(animal);
            pet.setNome(nome);
            pet.setRaca(raca);
            pet.setPeso(peso);

            petRepository.save(pet);*/

        } else {

            System.out.println("pet não salvo");

        }


    }


}
