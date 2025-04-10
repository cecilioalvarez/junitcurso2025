package es.curso.tdd.junit2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.curso.io.Lector;

class LectorTest {

	@Test
	void creacionLectorTest() {
		Lector lector= new Lector(new File("src/test/resources/notas.txt"));
		assertNotNull(lector);
	}
	
	@Test
	void leerFicheroTest() throws FileNotFoundException {
		Lector lector= new Lector( new File("src/test/resources/notas.txt"));
		List<String> lineas=lector.leer();
		assertEquals(7,lineas.size());
	}

}
