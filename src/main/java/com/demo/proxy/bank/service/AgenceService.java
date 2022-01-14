package com.demo.proxy.bank.service;

import com.demo.proxy.bank.entities.Agence;
import com.demo.proxy.bank.repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    public List<Agence> getAllAgences(){
        List<Agence> agences = new ArrayList<>();
        agenceRepository.findAll().forEach(agences::add);
        return agences;
    }

}
