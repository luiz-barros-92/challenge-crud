package com.luizbarros.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizbarros.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}