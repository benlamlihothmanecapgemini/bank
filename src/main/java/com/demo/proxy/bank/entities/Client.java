package com.demo.proxy.bank.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nom;
	
	@ManyToOne
	private Conseiller conseiller;

	private String prenom;

	private String adresse;

	private String codePostal;

	private String ville;

	private String phoneNumber;

	@OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
	private List<Compte> comptes = new ArrayList<>();

}
