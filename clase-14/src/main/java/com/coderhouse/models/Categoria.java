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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categorias")
@Schema(description = "Modelo de Categoria", title = "Modelo de Categoria")
public class Categoria {
	
	@Schema(description = "Id de Categoria", requiredMode =  Schema.RequiredMode.REQUIRED, example = "1" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "Nombre de la Categoria", requiredMode =  Schema.RequiredMode.REQUIRED, example = "Backend" )
	@Column(name = "Nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Curso> cursos = new ArrayList<>();

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Long id, String nombre, List<Curso> cursos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cursos = cursos;
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

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", cursos=" + cursos + "]";
	}
	
	

}
