package com.example.demoapi.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import jakarta.persistence.*;

@Entity
@Table(name = "Futbolista")
public class Futbolista implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFutbolista;
	
	@Column(name="nombresFutbolista", length=60, nullable=false)
    private String nombresFutbolista;

    @Column(name="apellidosFutbolista", length=60, nullable=false)
    private String apellidosFutbolista;

    @Column(name="fechaNacimientoFutbolista")
	@JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaNacimientoFutbolista;

    @Column(name="caracteristicasFutbolista", length=60, nullable=false)
    private String caracteristicasFutbolista;
    
    @ManyToOne
	@JoinColumn(name="idPosicion", nullable=false)
	private Posicion posicion;
    
    public Futbolista() {
    }

	public Futbolista(int idFutbolista, String nombresFutbolista, String apellidosFutbolista,
			LocalDate fechaNacimientoFutbolista, String caracteristicasFutbolista, Posicion posicion) {
		super();
		this.idFutbolista = idFutbolista;
		this.nombresFutbolista = nombresFutbolista;
		this.apellidosFutbolista = apellidosFutbolista;
		this.fechaNacimientoFutbolista = fechaNacimientoFutbolista;
		this.caracteristicasFutbolista = caracteristicasFutbolista;
		this.posicion = posicion;
	}

	public int getIdFutbolista() {
		return idFutbolista;
	}

	public void setIdFutbolista(int idFutbolista) {
		this.idFutbolista = idFutbolista;
	}

	public String getNombresFutbolista() {
		return nombresFutbolista;
	}

	public void setNombresFutbolista(String nombresFutbolista) {
		this.nombresFutbolista = nombresFutbolista;
	}

	public String getApellidosFutbolista() {
		return apellidosFutbolista;
	}

	public void setApellidosFutbolista(String apellidosFutbolista) {
		this.apellidosFutbolista = apellidosFutbolista;
	}

	public LocalDate getFechaNacimientoFutbolista() {
		return fechaNacimientoFutbolista;
	}

	public void setFechaNacimientoFutbolista(LocalDate fechaNacimientoFutbolista) {
		this.fechaNacimientoFutbolista = fechaNacimientoFutbolista;
	}

	public String getCaracteristicasFutbolista() {
		return caracteristicasFutbolista;
	}

	public void setCaracteristicasFutbolista(String caracteristicasFutbolista) {
		this.caracteristicasFutbolista = caracteristicasFutbolista;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

    	
    
}
