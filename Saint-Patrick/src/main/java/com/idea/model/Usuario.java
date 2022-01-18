package com.idea.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import lombok.Data;
@Data
@Entity
@Table (name = "usuario")
public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellido;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String nroTarjeta;
	
	@NotEmpty
	private String contraseña;
	
	
	public Usuario() {	
	}
	
	public Usuario(String nombre, String apellido, String email, String nroTarjeta, String contraseña) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.nroTarjeta = nroTarjeta;
		this.contraseña = contraseña;
	}

	
}
