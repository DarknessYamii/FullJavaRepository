package dam.modelos;

public class Representante {
	
	public String nombre;
	public int edad;
	public float sueldo;
	public GrupoMusica grupoRepresentado;
	
	public Representante() {}
	
	public Representante(String nombre, int edad, float sueldo, GrupoMusica grupo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
		this.grupoRepresentado=grupo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public GrupoMusica getGrupoRepresentado() {
		return grupoRepresentado;
	}

	public void setGrupoRepresentado(GrupoMusica grupoRepresentado) {
		this.grupoRepresentado = grupoRepresentado;
	}

	@Override
	public String toString() {
		return "El manager "+nombre+" representa al grupo "+grupoRepresentado;
	}

}
