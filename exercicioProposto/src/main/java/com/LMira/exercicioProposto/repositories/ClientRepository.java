package com.LMira.exercicioProposto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LMira.exercicioProposto.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
