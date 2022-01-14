package com.demo.proxy.bank.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "poste", discriminatorType = DiscriminatorType.STRING)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
