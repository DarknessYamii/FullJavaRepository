package dam.gestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import dam.modelos.Disco;
import dam.modelos.GrupoMusica;
import dam.modelos.Representante;

public class Gestion {
	
	static Scanner sc;
	static Set<Representante> empresa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		empresa = new HashSet<>();
		
		String opcion;

		do {
			menu();
			opcion = sc.nextLine();

			switch (opcion) {
				case "1": aniadir();
						break;
				case "2": modificar();
						break;
				case "3": eliminar();
						break;
				case "4": listar();
						break;
				case "5": break;
				default:System.err.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
			}

		} while(!opcion.equals("5"));
		
		sc.close();
			
	}
	
	public static void menu() {
		System.out.println("==============GESTI�N JMUSIC==============");
		System.out.println("==========================================");
		System.out.println("1. A�adir informaci�n");
		System.out.println("2. Editar informaci�n");
		System.out.println("3. Eliminar informaci�n");
		System.out.println("4. Listar informaci�n");
		System.out.println("5. SALIR DE LA APLICACI�N\n\n");
		System.out.print("Introduzca una opcion: ");
	}
	
	public static void aniadir() {
		System.out.println("\n\nA�ADIR NUEVO REPRESENTANTE");
		System.out.print("Introduzca el nombre: ");
		String nombreR = sc.nextLine();
		System.out.print("Introduzca la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduzca su numero de telefono: ");
		float sueldo = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduzca informaci�n sobre el grupo que representa:");
		System.out.print("Nombre: ");
		String nombreG = sc.nextLine();
		System.out.print("Pa�s: ");
		String pais = sc.nextLine();
		
		GrupoMusica grupo = new GrupoMusica(nombreG, pais);
		
		System.out.println("N�mero de discos del grupo:");
		int nCD = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<=nCD-1; i++) {
			System.out.print("Nombre: ");
			String nombreCD = sc.nextLine();
			System.out.print("A�o de publicaci�n: ");
			String anio = sc.nextLine();
		
			Disco CD = new Disco(nombreCD, anio);
		
			grupo.discografica.add(CD);
			
		
		}

		empresa.add(new Representante(nombreR, edad, sueldo, grupo));
		
		System.out.println("");
	}
	
	public static void listar() {
		if (empresa.isEmpty()) {
			System.err.println("Actualmente no hay datos almacenados");
		} else {
			System.out.println(empresa);
		}
		
		System.out.println("");
	}
	
	public static void eliminar() {
		System.out.println("\n\nELIMINAR REPRESENTANTE");
		System.out.println("�Qu� representante desea eliminar?:");
		String nombre=sc.nextLine();
		for(Representante rep: empresa) {
			if(rep.getNombre().equals(nombre)) {
				empresa.remove(rep);
				return;
			} else {
				System.err.println("No existen coincidencias con el nombre introducido");
			}
		}
		
		System.out.println("");
	}
	
	public static void modificar() {
		System.out.println("\n\nMODIFICAR REPRESENTANTE");
		System.out.println("�Qu� representante desea modificar?:");
		String nombre=sc.nextLine();
		for(Representante rep: empresa) {
			if(rep.getNombre().equals(nombre)) {
				empresa.remove(rep);
				aniadir();
				return;
			} else {
				System.err.println("No existen coincidencias con el nombre introducido");
			}
		}
		
		System.out.println("");
	}
}
