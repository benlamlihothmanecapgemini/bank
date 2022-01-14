package com.demo.proxy.bank.entities;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DiscriminatorValue(value = "GE")
public class Gerant extends Personne {


}
