package com.demo.proxy.bank.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "CS")
public class Conseiller extends Personne {

	@OneToMany(mappedBy = "conseiller")
	private List<Client> clients = new ArrayList<>();

	public Conseiller(Long id, List<Client> clients) {
		super(id);
		this.clients = clients;
	}

	public Conseiller(List<Client> clients) {
		this.clients = clients;
	}

	public Conseiller() {
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
}
