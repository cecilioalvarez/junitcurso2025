package es.curso;

import es.curso.utilidades.Calculadora;

public class Principal {

	public static void main(String[] args) {
	
		Calculadora c= new Calculadora();
		double resultado= c.sumar(2, 2);
		System.out.println(resultado);

	}

}
