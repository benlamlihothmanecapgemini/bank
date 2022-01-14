package com.demo.proxy.bank.repository;


import com.demo.proxy.bank.entities.Agence;
import com.demo.proxy.bank.entities.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConseillerRepository extends JpaRepository<Conseiller, Long> {

    Optional<Conseiller> findById(Long id);

    @Override
    List<Conseiller> findAll();
}
