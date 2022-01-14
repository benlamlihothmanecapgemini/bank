package com.demo.proxy.bank.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.proxy.bank.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
