package es.curso.tdd.junit2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import es.curso.Alumno;
import es.curso.io.Formateador;
import es.curso.io.FormateadorA;
import es.curso.io.FormateadorB;
import es.curso.io.Lector;

class FormateadoresTest {	
		
		@Test
		void listaAlumnoFormateadorATest() throws FileNotFoundException {
			
			// desacoplar una dependencia de otra 
			// usando un objeto mock para pruebas
			 List<String> lineas= new ArrayList<String>();
			 lineas.add("*****************");
			 lineas.add("antonio,matematicas,7.5");
			 lineas.add("antonio,lengua,8");
			 lineas.add("-----------------");
			 
			 Lector lector=Mockito.mock(Lector.class);
			 Mockito.when(lector.leer()).thenReturn(lineas);
			 
			 Formateador t= new FormateadorA (lector);
			 List<Alumno> lista= t.getListaAlumnos();
			 assertEquals("antonio", lista.get(0).getNombre());
			 assertEquals(2, lista.get(0).getLista().size());
				 
		}
		
		@Test
		void listaAlumnoFormateadorBTest() throws FileNotFoundException {
			
			
			// desacoplar una dependencia de otra 
			// usando un objeto mock para pruebas
			 List<String> lineas= new ArrayList<String>();
			 lineas.add("/////////////////");
			 lineas.add("matematicas,7.5,antonio");
			 lineas.add("lengua,8,antonio");
			 lineas.add("-----------------");
			 
			 Lector lector=Mockito.mock(Lector.class);
			 Mockito.when(lector.leer()).thenReturn(lineas);
			 
			 Formateador t= new FormateadorB (lector);
			 List<Alumno> lista= t.getListaAlumnos();
			 assertEquals("antonio", lista.get(0).getNombre());
			 assertEquals(2, lista.get(0).getLista().size());
				 
		}
		
		
	}


