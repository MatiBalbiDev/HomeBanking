package com.idea.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
@Entity
@Table (name = "cuenta")
public class Cuenta {
	@NonNull
	private Integer saldo;
	
	@NonNull
	private String cbu;
	
	@NonNull
	private String alias;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Cuenta() {}
	
	
	public Cuenta(Integer saldo, String cbu, String alias) {
		this.saldo = saldo;
		this.cbu = cbu;
		this.alias = alias;
	}
}
