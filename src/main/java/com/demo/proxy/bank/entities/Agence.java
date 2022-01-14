package com.demo.proxy.bank.entities;

import lombok.*;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Agence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long identificationNumber;

	private LocalDate creationDate;

}
