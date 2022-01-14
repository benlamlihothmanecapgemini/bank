package com.demo.proxy.bank.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String numeroCompte;
	
	private LocalDate dateOuverture;
	
	private BigDecimal solde;

	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "compte")
	private List<Carte> cartes = new ArrayList<>();
}
