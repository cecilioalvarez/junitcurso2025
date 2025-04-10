package es.curso.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import es.curso.Alumno;

public class Transformador {


	private Formateador formateador;
	

	public Transformador(String ruta, String tipo) {
		
		Lector lector= new Lector(new File(ruta));
		if (tipo.equals("A")) {
			
			formateador= new FormateadorA(lector);
		}else {
			
			formateador= new FormateadorB(lector);
		}
		
	}

	public Transformador(Formateador formateador) {
		
		
		this.formateador=formateador;
	}


	public List<Alumno> getListaAlumnos() throws FileNotFoundException {
		
		return formateador.getListaAlumnos();
	}

}
