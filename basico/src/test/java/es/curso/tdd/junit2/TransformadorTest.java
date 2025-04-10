package es.curso.tdd.junit2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import es.curso.io.Formateador;
import es.curso.io.FormateadorA;
import es.curso.io.Lector;
import es.curso.io.Transformador;

class TransformadorTest {

	
	
	// de hecho ya estaba construido
	@Test
	void listaAlumnosVerificarDependenciasTest() throws FileNotFoundException {
		
		Formateador formateador= Mockito.mock(Formateador.class);
		Transformador t= new Transformador(formateador);
		t.getListaAlumnos();
		Mockito.verify(formateador,Mockito.times(1)).getListaAlumnos();
		
		 
	}

}
