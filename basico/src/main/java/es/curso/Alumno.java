package es.curso;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	
	private String nombre;
	private List<Nota> lista= new ArrayList<Nota>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addNota (Nota nota) {
		
		this.lista.add(nota);
		
	}
	
	public double getNotaMedia() {
		
		double total=0;
		for (Nota nota: lista) {
			
			total+=nota.getValor();
		}
		
		return total/lista.size();
		
	}
	public void removeNota(Nota nota) {
		
		this.lista.remove(nota);
	}

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}
	
	

}
