package com.bootcamp.clientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.clientcrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
