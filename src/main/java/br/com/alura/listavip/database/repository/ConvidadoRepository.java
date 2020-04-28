package br.com.alura.listavip.database.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.database.entity.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Integer> {}
