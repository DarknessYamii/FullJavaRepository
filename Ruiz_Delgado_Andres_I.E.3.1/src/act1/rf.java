package act1;

import java.util.Scanner;
public class rf {
	public static void main(String[] args) {
		

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Introduzca numero de filas: ");
	    int numFilas = sc.nextInt();
	    sc.close();

	    System.out.println();
	    for(int altura = 1; altura<=numFilas; altura++){
	        for(int espacio = 1; espacio<=numFilas-altura; espacio++){
	            System.out.print(" ");
	        }

	        for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
	            System.out.print("");
	        }
	        System.out.println();
	    }
	}
	}

