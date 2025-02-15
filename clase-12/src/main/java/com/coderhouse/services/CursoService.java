package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CategoriaRepository;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public List<Curso> getAllCursos(){
		return cursoRepository.findAll();
	}
	
	public Curso findById(Long id) {
		return cursoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Curso no Encontrado"));
	}
	
	@Transactional
	public Curso saveCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@Transactional
	public Curso updateCursoById(Long id, Curso cursoDetails) {
		Curso cursoModificado = cursoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Curso no Encontrado"));
		cursoModificado.setNombre(cursoDetails.getNombre());
		
		return cursoRepository.save(cursoModificado);
	}
	
	public void deleteById(Long id) {
		if(cursoRepository.existsById(id)) {
			cursoRepository.deleteById(id);
		}else {
			throw new IllegalArgumentException("Curso no Encontrado");
		}
	}
	
	@Transactional
	public Curso asignarCursoCategoria(Long cursoId, Long categoriaId) {
		Categoria categoria = categoriaRepository.findById(categoriaId)
				.orElseThrow(()-> new IllegalArgumentException("Categoria no Encotrada"));
		Curso curso = cursoRepository.findById(cursoId)
				.orElseThrow(()-> new IllegalArgumentException("Curso no Encontrado"));
		
		curso.setCategoria(categoria);
		
		return cursoRepository.save(curso);
	}
	

}
