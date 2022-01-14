package com.demo.proxy.bank.repository;


import com.demo.proxy.bank.entities.Gerant;
import com.demo.proxy.bank.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

    Optional<Personne> findById(Long id);
}
