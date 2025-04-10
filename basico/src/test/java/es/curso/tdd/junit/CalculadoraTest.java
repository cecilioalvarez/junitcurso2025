package es.curso.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.curso.utilidades.Calculadora;

class CalculadoraTest {

	// AAA 
	@Test
	@DisplayName("suma dos numeros enteros")
	void sumarNumerosTest() {
	
		//arrange
		Calculadora calculadora= new Calculadora();
		
		//act
		double sumaNumeros= calculadora.sumar(2, 2);

		//assert
		assertEquals(4,sumaNumeros);
		
	
	}
	
	@Test
	@DisplayName("resta dos numeros enteros")
	void restarNumerosTest() {
	
		//arrange
		Calculadora calculadora= new Calculadora();
		
		//act
		double sumaNumeros= calculadora.restar(2, 2);

		//assert
		assertEquals(0,sumaNumeros);
		
	
	}
	
	@Test
	@DisplayName("multiplica dos numeros enteros")
	void multiplicaNumerosTest() {
	
		//arrange
		Calculadora calculadora= new Calculadora();
		
		//act
		double multiplicaNumeros= calculadora.multiplicar(2, 3);

		//assert
		assertEquals(6,multiplicaNumeros);
		
	
	}
	

}
