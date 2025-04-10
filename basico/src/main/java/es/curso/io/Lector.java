package es.curso.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {

	private File fichero;
	
	public Lector(File fichero) {
	this.fichero=fichero;
	}
	
	
	public File getFichero() {
		return fichero;
	}

	public void setFichero(File fichero) {
		this.fichero = fichero;
	}


	public List<String> leer() throws FileNotFoundException {
	
		List<String> lineas=new ArrayList<String>();
		Scanner sc= new Scanner(fichero);
		while (sc.hasNextLine()) {
			lineas.add(sc.nextLine());
		}
		sc.close();
		return lineas;
	}

}
