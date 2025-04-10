package es.curso.io;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import es.curso.Alumno;
import es.curso.Nota;

public class FormateadorB implements Formateador {

	private Lector lector;

	public FormateadorB(Lector lector) {
		super();
		this.lector = lector;
	}

	@Override
	public List<Alumno> getListaAlumnos() throws FileNotFoundException {
		
		List<Alumno> lista= new ArrayList<Alumno>();
		
		List<String> lineas= lector.leer();
		//una preparacion del fichero de lo que hemos leido
		//estamos filtrando filas
		
		lineas.removeIf ((linea)-> linea.contains("/"));
		lineas.removeIf ((linea)-> linea.contains("-"));
		
		for (String linea: lineas) {
			
			String[] datosLinea= linea.split(",");
			//antonio
			Alumno alumno= new Alumno(datosLinea[2]);
			Nota nota= new Nota(Double.parseDouble(datosLinea[1]),datosLinea[0]);
			if (!lista.contains(alumno)) {
				
				
				alumno.addNota(nota);
				lista.add(alumno);
				
			}else {
				
				int posicion=lista.indexOf(alumno);
				lista.get(posicion).addNota(nota);
				
			}
		}
		
		return lista;
	}
	
	
}
