package com.demo.proxy.bank.service;

import com.demo.proxy.bank.repository.CarteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteService {

    @Autowired
    private CarteRepository carteRepository;
}
