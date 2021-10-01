/**
 * Definici�n e implementaci�n de una clase
 */
package objetos;

/**
 * @author DAM
 *
 */
class Persona {
	
	
	//Estructura, conocida como  propiedades o atributos
	String nombre;
	String apellidos;
	int edad;
	int altura;
	float peso;
	
	//Constructores
	
//	Persona(String n, String ape, int e, int a, float p){
//		nombre=n;
//		apellidos=ape;
//		edad=e;
//		altura=a;
//		peso=p;
//		
//	}
	
	//Comportamiento, conocido como m�todos
	public void caminar() {
		System.out.println("Estoy caminando");
	}
	
	public void hablar() {
		System.out.println("Estoy hablando");
	}
	
	public void nacer() {
		System.out.println("���Acabo de nacer!!!");
	}
	
	public void morir() {
		System.out.println("�Hasta m�s ver!");
	}
	

}
