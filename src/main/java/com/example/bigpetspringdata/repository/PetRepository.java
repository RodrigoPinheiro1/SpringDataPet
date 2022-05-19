package com.example.bigpetspringdata.repository;

import com.example.bigpetspringdata.orm.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet,Long> {


}
