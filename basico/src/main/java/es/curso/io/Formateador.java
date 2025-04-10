package es.curso.io;

import java.io.FileNotFoundException;
import java.util.List;

import es.curso.Alumno;

public interface Formateador {

	List<Alumno> getListaAlumnos() throws FileNotFoundException;

}