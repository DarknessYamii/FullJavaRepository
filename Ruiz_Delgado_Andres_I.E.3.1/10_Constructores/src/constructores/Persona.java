/**
 * Definici�n e implementaci�n de una clase
 */
package constructores;

/**
 * @author DAM
 *
 */
public class Persona {

	// Estructura, conocida como propiedades o atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;

	// Constructor vac�o
	public Persona() {
		
		this.nombre = "desconocido";
		this.apellidos = "desconocido";
		this.edad = 0;
	}

	// Constructor con algunos par�metros
	public Persona(String n, String a) {
		this.nombre = n;
		this.apellidos = a;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);
		this.edad = edad;
	}
	
	

	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	// Comportamiento, conocido como m�todos
	void caminar() {
		System.out.println("Estoy caminando");
	}

	void hablar() {
		System.out.println("Estoy hablando");
	}

	void nacer() {
		System.out.println("���Acabo de nacer!!!");
	}

	void morir() {
		System.out.println("�Hasta m�s ver!");
	}

	void presentacion() {
		System.out.println(
				"Mi nombre es " + this.nombre + " " + this.apellidos + ", y tengo " + this.edad + " a�os de edad.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
}
