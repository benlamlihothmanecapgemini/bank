package com.demo.proxy.bank.repository;

import com.demo.proxy.bank.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {

    Optional<Agence> findById(Long id);

    @Override
    List<Agence> findAll();

}
