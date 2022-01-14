package com.demo.proxy.bank.repository;

import com.demo.proxy.bank.entities.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {
    @Override
    Optional<Carte> findById(Long aLong);

    @Override
    List<Carte> findAll();
}
