package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner {

	@Autowired
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			Curso curso1 = new Curso("Java");
			
			Curso curso2 = new Curso("HHTMLS");
			
			Curso curso3 = new Curso("JavaScrip");
			
			Curso curso4 = new Curso("CSS3");
			
			Alumno alumno1 = new Alumno("Martin", "Ferreyra", 21333444, "L222634");
			Alumno alumno2 = new Alumno("Gerardo", "Depetris", 13333444, "L222335");
			Alumno alumno3 = new Alumno("Rodrigo", "Lazos", 45333444, "L222336");
			Alumno alumno4 = new Alumno("Rocio", "Pereyra", 89333444, "L222337");
			
			dao.persistirAlumno(alumno1);
			dao.persistirAlumno(alumno2);
			dao.persistirAlumno(alumno3);
			dao.persistirAlumno(alumno4);
			
			dao.persistirCurso(curso1);
			dao.persistirCurso(curso2);
			dao.persistirCurso(curso3);
			dao.persistirCurso(curso4);
			
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	
}
