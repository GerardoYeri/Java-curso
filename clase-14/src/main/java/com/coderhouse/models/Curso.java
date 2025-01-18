package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
@Schema(description = "Modelo de Curos", title = "Modelo de Curso")
public class Curso {
	
	@Schema(description = "Id del Curso", requiredMode =  Schema.RequiredMode.REQUIRED, example = "1" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "Nombre del Curso", requiredMode =  Schema.RequiredMode.REQUIRED, example = "Java" )
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
				name = "curso_alumno",
				joinColumns = @JoinColumn(name = "curso_id"),
				inverseJoinColumns = @JoinColumn(name = "alumno_id")
			)
	@JsonIgnore
	private List<Alumno> alumnos = new ArrayList<>();
	
	@Schema(description = "Categoria del Curso", requiredMode =  Schema.RequiredMode.REQUIRED, example = "BackEnd" )
	@ManyToOne(fetch = FetchType.EAGER)
	private Categoria categoria;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(Long id, String nombre, List<Alumno> alumnos, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alumnos = alumnos;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + ", categoria=" + categoria + "]";
	}
	
	
	
}
