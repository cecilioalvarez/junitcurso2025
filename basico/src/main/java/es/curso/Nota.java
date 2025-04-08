package es.curso;

import java.util.Objects;

public class Nota {

	public enum Tipo {

		MUYDEFICIENTE, INSUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE
	}

	private double valor;
	private String asignatura;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Nota(double valor, String asignatura) {
		super();
		this.valor = valor;
		this.asignatura = asignatura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(asignatura, other.asignatura)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	public Tipo getTipo() {

		if (getValor() >= 0 && getValor() < 3) {

			return Tipo.MUYDEFICIENTE;
		} else if (getValor() >= 3 && getValor() < 5) {
			return Tipo.INSUFICIENTE;

		}  else if (getValor() >= 5 && getValor() < 7) {
			return Tipo.BIEN;

		} else if (getValor() >= 7 && getValor() < 9) {
			return Tipo.NOTABLE;

		} else {

			return Tipo.SOBRESALIENTE;
		}
	}
	
	public boolean esMismaAsignatura(Nota otra) {
		
		if (this.getAsignatura().equals(otra.getAsignatura())) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public boolean esMayor (Nota otra) {
		
		
		if (this.esMismaAsignatura(otra)) {
			
			if (this.getValor()>otra.getValor()) {
				return true;
			}else {
				return false;
			}
		}else {
			
			throw new RuntimeException("las notas no son comparables");
		}
		
		
	}

}
