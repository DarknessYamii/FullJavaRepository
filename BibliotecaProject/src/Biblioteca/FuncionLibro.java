package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionLibro {
	
	Scanner sc = new Scanner(System.in);

	ArrayList<Libro> libros = new ArrayList<>();
	
	public void addLibro()
	{
		System.out.println("Nombre del libro");
		String nombreLibro = sc.nextLine();
		System.out.println("Nombre del autor del libro");
		String nombreAutor = sc.nextLine();
		libros.add(new Libro(nombreLibro,nombreAutor));
	}
	
}
