package es.curso.tdd.integration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.curso.Alumno;
import es.curso.Clase;
import es.curso.Nota;

class ClaseIntegrationTest {

	
	@Test
	@DisplayName(" calcular nota media clase")
	void calcularNotaMediaTest() {
		
		Clase c1= new Clase("1");
		List<Alumno> lista= new ArrayList<Alumno>();
		
		Alumno pedro= new Alumno("pedro");
		pedro.addNota(new Nota(4,"Matematicas"));
		pedro.addNota(new Nota(6,"lengua"));
		
		Alumno ana= new Alumno("ana");
		ana.addNota(new Nota(1,"Matematicas"));
		ana.addNota(new Nota(3,"lengua"));
		
		lista.add(pedro);
		lista.add(ana);
		
		c1.setAlumnos(lista);
		
		
		assertEquals(3.5,c1.getMedia());
		
	}
	
}
