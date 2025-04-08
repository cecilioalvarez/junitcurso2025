package es.curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

import es.curso.Nota.Tipo;

public class Alumno {

	private String nombre;
	private List<Nota> lista = new ArrayList<Nota>();

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

	public void addNota(Nota nota) {

		this.lista.add(nota);

	}

	public double getNotaMedia() {

		// programacion imperativa
		// mantiene un estado con variables
		// puede dar opciones a errores tontos
		// declarativa

		return lista.stream().mapToDouble(Nota::getValor).average().orElse(0);

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

	public Nota getNotaMayor() {

		Nota notaMayor = lista.get(0);

		for (Nota n : lista) {

			if (notaMayor.getValor() < n.getValor()) {
				notaMayor = n;
			}
		}
		return notaMayor;
	}

	public int getSobreSalientes() {

		return getNotasTipo(Tipo.SOBRESALIENTE);
	}
	
	public int getNotables() {

	return getNotasTipo(Tipo.NOTABLE);
	}
	
	private int getNotasTipo(Tipo tipoNota) {
		
		int i = 0;

		for (Nota n : lista) {

			if (n.getTipo().equals(tipoNota)) {
				i++;
			}
		}
		return i;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}


}
