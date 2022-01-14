package com.demo.proxy.bank.repository;

import com.demo.proxy.bank.entities.Conseiller;
import com.demo.proxy.bank.entities.Gerant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GerantRepository extends JpaRepository<Gerant, Long> {

    Optional<Gerant> findById(Long id);
}
