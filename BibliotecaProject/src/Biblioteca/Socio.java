package Biblioteca;

import java.util.HashMap;

public class Socio {

	
	HashMap<Integer, Libro> librosPrestados = new HashMap<>();
	static int cod = 0 ;
	private String numCarnet,nombre;
	public Socio(String numCarnet, String nombre) {
		super();
		this.numCarnet = numCarnet;
		this.nombre = nombre;
	}
	
	
	
}
