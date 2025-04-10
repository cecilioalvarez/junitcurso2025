package es.curso.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.curso.Alumno;
import es.curso.Nota;


class AlumnoTest {
	
	@Test
	@DisplayName(" añadir nota al alumno")
	void addNotaTest() {
		
		Alumno alumno1=helperAlumnoCrearConNotas("pedro",new Nota(10,"matematicas"));
		Nota nota= new Nota(5,"matematicas");
		
		alumno1.addNota(nota);
 		List<Nota> listaNotas= alumno1.getLista();
 	
 		assertTrue(listaNotas.contains(nota));	
	}
	
	@Test
	@DisplayName(" eliminar nota del alumno")
	void removeNotaTest() {
		
		Nota nota= new Nota(5,"matematicas");
		Alumno alumno1=helperAlumnoCrearConNotas("pedro",nota);
		
		alumno1.removeNota(nota);
		List<Nota> listaNotas= alumno1.getLista();
		
		assertFalse(listaNotas.contains(nota));
		
	}
	
	
	@Test
	@DisplayName(" calcular nota media")
	void calcularNotaMediaTest() {
		
		Alumno alumno=helperAlumnoCrearConNotas("pedro", new Nota(4,"matematicas"),new Nota(6,"lengua"));

		assertEquals(5,alumno.getNotaMedia());
		
	}
	
	
	
	
	
	private Alumno helperAlumnoCrearConNotas(String nombre, Nota ... notas) {
		
		
		Alumno alumno= new Alumno(nombre);
		
		List<Nota> lista= new ArrayList<Nota>();
		
		for (Nota nota : notas) {
			
			lista.add(nota);
		}
		alumno.setLista(lista);
		
		return alumno;
		
	}
	@Test
	@DisplayName("igualdad por nombre entre alumnos")
	public void igualdadAlumnos() {
		
		Alumno pedro = new Alumno("pedro");
		Alumno pedro2= new Alumno("pedro");
		
		assertEquals(pedro,pedro2);
		
	}

	

}
