package com.example.demoapi.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="Posicion")
public class Posicion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPosicion;
	
	@Column(name="nombrePosicion", length=60, nullable=false)
	private String nombrePosicion;

	public Posicion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Posicion(int idPosicion, String nombrePosicion) {
		super();
		this.idPosicion = idPosicion;
		this.nombrePosicion = nombrePosicion;
	}

	public int getIdPosicion() {
		return idPosicion;
	}

	public void setIdPosicion(int idPosicion) {
		this.idPosicion = idPosicion;
	}

	public String getNombrePosicion() {
		return nombrePosicion;
	}

	public void setNombrePosicion(String nombrePosicion) {
		this.nombrePosicion = nombrePosicion;
	}	
	
	
}
