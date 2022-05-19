package com.example.bigpetspringdata.repository;

import com.example.bigpetspringdata.orm.Racao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacaoRepository extends CrudRepository<Racao, Long> {



}
