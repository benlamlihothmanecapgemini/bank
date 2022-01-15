package com.demo.proxy.bank.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DiscriminatorValue(value = "CS")
public class Conseiller extends Personne {

	@OneToMany(mappedBy = "conseiller")
	private List<Client> clients = new ArrayList<>();

}
