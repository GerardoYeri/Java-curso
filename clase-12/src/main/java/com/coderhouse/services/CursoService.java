package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
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
}
