/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author DAM
 *
 */
public class ManejoArrays05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
//			Random r = new Random();		
//			array[i]=r.nextInt(tope-1);
			
			array[i] = aleatorio(100);
		}
		
		printArray(array);
				
		
		//Podemos crear otro array, copia del primero, ampliando su longitud
		int[] otroArray = Arrays.copyOf(array, 200);
		
		//Podemos ordenar los elementos de un array
		Arrays.sort(otroArray);
		System.out.println("");
		System.out.println("Array ordenado");
		printArray(otroArray);
		
		//Posici�n de un n�mero aleatorio, si es que est�
		int num = aleatorio(100);
		int pos = Arrays.binarySearch(array, num);
		System.out.println("");
		if (pos >= 0)
			System.out.printf("El elemento " + num + " est� contenido en el array, en la posici�n "+ pos);
		else
			System.out.println("El elemento " + num + " no est� en el array");

		
		//JAVA SE 8
		//El m�todo parallelsort realiza una ordenaci�n m�s r�pida para arrays
		//muy largos
		int[] arrayGrande = new int[123456];
		//Este m�todo sirve para inicializar un array con valores
		//y usa una expresi�n lambda, que aprenderemos a crear
		//en la �ltima lecci�n del curso
		Arrays.parallelSetAll(arrayGrande, i -> aleatorio(12345));		
		Arrays.parallelSort(arrayGrande);
	}
	
	/*
	 * ESTE M�TODO DEVUELVE UN N�MERO ALEATORIO ENTRE
	 * 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();		
		return r.nextInt(tope-1);
	}
	
	/*
	 * Este m�todo imprime un array, indicando para
	 * cada elemento su valor y su posici�n
	 */
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "[" + i +"]  ");
			if (i > 0 && i % 10 == 0) {
				System.out.println("");}
		}
		System.out.println("");
	}


}
