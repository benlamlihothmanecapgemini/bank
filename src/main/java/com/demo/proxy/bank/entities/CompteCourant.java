package com.demo.proxy.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Courant")
public class CompteCourant extends Compte{
}
