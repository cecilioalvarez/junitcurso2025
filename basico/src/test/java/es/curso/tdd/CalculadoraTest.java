package es.curso.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import es.curso.Calculadora;

class CalculadoraTest {

	// AAA 
	@Test
	void test() {
		//arrange que se traduciria por preparar
		Calculadora c= new Calculadora();
		
		//act actuar 
		
		double suma= c.sumar(2, 2);
		
		// assert confirmar
		
		assertEquals(4,suma);
		
	
	}

}
