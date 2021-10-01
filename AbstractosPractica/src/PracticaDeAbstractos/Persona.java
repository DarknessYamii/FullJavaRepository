package PracticaDeAbstractos;

public class Persona {

	private String nombre, apellidos, NIF;

	public Persona(String nombre, String apellidos, String nIF) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		NIF = nIF;
	}

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + "]";
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}
}
