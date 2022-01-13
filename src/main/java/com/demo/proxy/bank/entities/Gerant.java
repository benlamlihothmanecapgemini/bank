package com.demo.proxy.bank.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "GE")
public class Gerant extends Personne {


}
