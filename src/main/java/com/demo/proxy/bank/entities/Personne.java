package com.demo.proxy.bank.entities;

import lombok.*;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "poste", discriminatorType = DiscriminatorType.STRING)
public class Personne {

	private String nom;

	private String prenom;

	private String adresse;

	private String codePostal;

	private String ville;

	private String phoneNumber;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
