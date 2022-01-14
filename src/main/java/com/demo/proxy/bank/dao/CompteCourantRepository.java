package com.demo.proxy.bank.dao;

import com.demo.proxy.bank.entities.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long> {
}
