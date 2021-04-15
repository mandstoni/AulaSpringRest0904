package com.br.repository;

import com.br.model.Medicamento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends MongoRepository<Medicamento, String> {

}
