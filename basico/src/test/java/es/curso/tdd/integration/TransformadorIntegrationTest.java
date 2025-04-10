package es.curso.tdd.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.curso.Alumno;
import es.curso.io.Formateador;
import es.curso.io.FormateadorA;
import es.curso.io.Lector;
import es.curso.io.Transformador;

class TransformadorIntegrationTest {

	@Test
	void cargarNotas1Test() throws FileNotFoundException {
		
		// no usas mocks
		Lector lector= new Lector(new File("src/test/resources/notas.txt"));
		Formateador f= new FormateadorA(lector);
		Transformador t= new Transformador(f);
		List<Alumno> lista=t.getListaAlumnos();
		assertEquals(2,lista.size());
		
	}
	
	@Test
	void cargarNotas2Test() throws FileNotFoundException {
		
	
		Transformador t= new Transformador("src/test/resources/notas.txt","A");
		List<Alumno> lista=t.getListaAlumnos();
		assertEquals(2,lista.size());
		
	}

}
