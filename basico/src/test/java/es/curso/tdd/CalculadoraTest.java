package es.curso.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import es.curso.Calculadora;

class CalculadoraTest {

	// AAA 
	@Test
	void sumarNumerosTest() {
	
		//arrange
		Calculadora calculadora= new Calculadora();
		
		//act
		double sumaNumeros= calculadora.sumar(2, 2);

		//assert
		assertEquals(4,sumaNumeros);
		
	
	}
	
	@Test
	void restarNumerosTest() {
	
		//arrange
		Calculadora calculadora= new Calculadora();
		
		//act
		double sumaNumeros= calculadora.restar(2, 2);

		//assert
		assertEquals(0,sumaNumeros);
		
	
	}

}
