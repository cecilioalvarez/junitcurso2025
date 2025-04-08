package es.curso.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.curso.Nota;

class NotaTest {

	@Test
	@DisplayName("las dos notas son iguales con valor y asignatura")
	void igualdadNotasTest() {
		
		//FIRST a nivel de las pruebas unitarias
		
		// FAST , ISOLATED , REPEATABLE , SELF VALIDATING ,TIMELY
		
		//arrange
		Nota nota1= new Nota (5,"matematicas");
		Nota nota2= new Nota (5,"matematicas");
		
		boolean sonIguales= nota1.equals(nota2);
		
		assertTrue(sonIguales);
	}
	
	@Test
	@DisplayName("las dos notas NO son iguales en VALOR")
	void noIgualdadNotasValorTest() {
		
		//homegeneidad //arrange
	
		Nota nota1= new Nota (5,"matematicas");
		Nota nota2= new Nota (6,"matematicas");
		
		// act 
		boolean iguales= nota1.equals(nota2);
		
		//assert
		
		assertFalse(iguales);
	}
	
	@Test
	@DisplayName("las dos notas NO son iguales en ASIGNATURA")
	void noIgualdadNotasAsignaturaTest() {
		
	
	
	
		Nota nota3= new Nota (6,"matematicas");
		Nota nota4= new Nota (6,"lengua");
		
		// act 
		boolean asignaturaIguales= nota3.equals(nota4);
		
		//assert
		assertFalse(asignaturaIguales);
	}
	
	
	@Test
	@DisplayName("las notas tienen la misma ASIGNATURA")
	
	void lasNotasTienenLaMismaAsignaturaTest() {
		
		Nota nota1= new Nota (2,"lengua");
		Nota nota2= new Nota (2,"lengua");
		Nota nota3= new Nota (2,"ingles");
	
		boolean sonIguales=nota1.esMismaAsignatura(nota2);
		boolean sonIguales2=nota1.esMismaAsignatura(nota3);
		
		
		assertTrue (sonIguales);
		assertFalse (sonIguales2);
	}
	
	
	@Test
	@DisplayName("Una nota es mayor que otra nota")
	
	void unaNotaEsMayorQueOtraTest() {
		
		Nota nota1= new Nota (2,"lengua");
		Nota nota2= new Nota (5,"lengua");
		
		boolean esMayor= nota2.esMayor(nota1);
		
		assertTrue (esMayor);
	}
	
	
	@Test
	@DisplayName("las notas no se pueden comparar")
	
	void lasNotasNoSePuedenCompararTest() {
		
		Nota nota1= new Nota (2,"ingles");
		Nota nota2= new Nota (5,"lengua");
		
		assertThrows(RuntimeException.class,()->nota1.esMayor(nota2));
	}
	
	
	
	@Test
	@DisplayName("la nota es un Bien")
	void el_Tipo_De_La_Nota_Es_BIEN_Test() {
		
	//antes practicamente teniamos un assert en cada condicion
		
		//porque no aporta porque aporta una funcionalidad 
		// correcate muy clara
		
		Nota notaBien= new Nota (6,"matematicas");
		
		Nota nota5Justa= new Nota (5,"matematicas");
		Nota nota7Notable= new Nota (7,"matematicas");
		
		Nota.Tipo tipoBien=notaBien.getTipo();
		Nota.Tipo tipoBien2=nota5Justa.getTipo();
		Nota.Tipo tipoNotable=nota7Notable.getTipo();
		
		assertEquals(Nota.Tipo.BIEN,tipoBien);
		assertEquals(Nota.Tipo.BIEN,tipoBien2);
		
		assertNotEquals(Nota.Tipo.BIEN, tipoNotable);
		
	}
	
	
	@Test
	@DisplayName("la nota es insuficiente")
	void el_Tipo_De_La_Nota_Es_INSUFICIENTE_Test() {
		
	//antes practicamente teniamos un assert en cada condicion
		
		//porque no aporta porque aporta una funcionalidad 
		// correcate muy clara
		
		Nota notaInsuficiente1= new Nota (3.1,"matematicas");
		
		Nota notaInsuficiente2= new Nota (4.9,"matematicas");
		
		Nota.Tipo insuficiente1=notaInsuficiente1.getTipo();
		Nota.Tipo insuficiente2=notaInsuficiente1.getTipo();
	
		
		assertEquals(Nota.Tipo.INSUFICIENTE,insuficiente1);
		assertEquals(Nota.Tipo.INSUFICIENTE,insuficiente2);
		
		
		
	}
	

}
