package main;

import java.io.File;

public class testDom {
	
	
	public static void main(String[] args) {
		File file = new File("../Acceso2/data/libros.xml");   
		
		GestorDOM gestor = new GestorDOM();
		gestor.abrirXmlDom(file);
		String datos = gestor.recorrerDOM();
		System.out.println(datos);
	}
}
