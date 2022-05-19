package com.example.bigpetspringdata.repository;


import com.example.bigpetspringdata.orm.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente,Long>  {


}
