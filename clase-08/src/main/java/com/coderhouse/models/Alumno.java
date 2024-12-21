package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumnos")
public class Alumno {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental
	private long id;
	
	@Column(name = "Nombre")
	private String nombre;
	private String apellido;
	
	@Column(unique = true, nullable = false) // va a ser unico y no nulo
	private int dni;
	
	@Column(unique = true, nullable = false) // va a ser unico y no nulo
	private String legajo; 
	
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	
	private LocalDateTime cretedATime;

	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public LocalDateTime getCretedATime() {
		return cretedATime;
	}

	public void setCretedATime(LocalDateTime cretedATime) {
		this.cretedATime = cretedATime;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo="
				+ legajo + ", cursos=" + cursos + ", cretedATime=" + cretedATime + "]";
	}

	public Alumno() {
		super();
		
	}

	public Alumno(String nombre, String apellido, int dni, String legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
	}
	
	
	
	
}
