package es.curso.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import es.curso.Alumno;
import es.curso.Clase;
import es.curso.Nota;

class ClaseTest {

	@Test
	@DisplayName(" add alumno a la clase")
	void addAlumnoTest() {
		
		Clase c1= new Clase("1");
		
		c1.addAlumno(new Alumno("pedro"));
		
		assertTrue(c1.getAlumnos().contains(new Alumno("pedro")));
		
	}
	
	@Test
	@DisplayName(" remove alumno a la clase")
	void removeAlumnoTest() {
		
		Clase c1= new Clase("1");
		List<Alumno> lista= new ArrayList<Alumno>();
		lista.add(new Alumno("pedro"));
		c1.setAlumnos(lista);
		//act 
		c1.removeAlumno(new Alumno("pedro"));
		
		assertTrue(c1.getAlumnos().isEmpty());
		
	}

	

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
		//act 
		
		
		assertEquals(3.5,c1.getMedia());
		
	}
	
	@Test
	@DisplayName(" calcular nota media clase")
	void calcularNotaMediaTest2() {
		
		Clase c1= new Clase("1");
		List<Alumno> lista= new ArrayList<Alumno>();	
		Alumno alumno1= Mockito.mock(Alumno.class);
		Mockito.when(alumno1.getNotaMedia()).thenReturn(4.0);
		Alumno alumno2= Mockito.mock(Alumno.class);
		Mockito.when(alumno2.getNotaMedia()).thenReturn(2.0);
	
		lista.add(alumno1);
		lista.add(alumno2);
		
		c1.setAlumnos(lista);
		//act 
		assertEquals(3,c1.getMedia());
		
	}

}
