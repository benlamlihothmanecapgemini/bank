package com.demo.proxy.bank.dao;

import com.demo.proxy.bank.entities.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Long> {
}
