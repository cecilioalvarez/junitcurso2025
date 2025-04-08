package es.curso.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.curso.Alumno;
import es.curso.Nota;

class AlumnoEstadisticasNotasTest {

	
	@Test
	@DisplayName(" calcular notables")
	void calcularNumeroNotables() {
		
		Alumno alumno=helperAlumnoCrearConNotas("pedro", new Nota(8.2,"matematicas"),new Nota(8,"lengua"));

		assertEquals(2,alumno.getNotables());
		
	}
	
	
	@Test
	@DisplayName(" calcular sobreSalientes")
	void calcularNumeroSobreSalientes() {
		
		Alumno alumno=helperAlumnoCrearConNotas("pedro", new Nota(4,"matematicas"),new Nota(10,"lengua"));

		assertEquals(1,alumno.getSobreSalientes());
		
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
	
}
