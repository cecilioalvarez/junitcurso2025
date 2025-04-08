package es.curso;

import java.util.ArrayList;
import java.util.List;

public class Clase {

	private String nombre;
	
	private List<Alumno> alumnos= new ArrayList<Alumno>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Clase(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addAlumno(Alumno alumno) {
		
		this.alumnos.add(alumno);
		
	}
	
	public void removeAlumno(Alumno alumno) {
		
		this.alumnos.remove(alumno);
		
	}
	
	public double getMedia() {
		
		double total=0;
		for (Alumno alumno:alumnos) {
			//sino que tengo que conocer
			// en quieres delega
			//porque lo vamos a simular
			total+= alumno.getNotaMedia();
		}
		return total/alumnos.size();
	}
	
}
