package dam.modelos;

import java.util.SortedSet;
import java.util.TreeSet;

public class GrupoMusica {
	
	public String nombre;
	public String pais;
	public SortedSet<Disco> discografica;
	
	public GrupoMusica() {}
	
	public GrupoMusica(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.discografica = new TreeSet<Disco>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return nombre+ ". La discografía de este grupo está compuesta por los discos: "+stringDiscografica();
	}
	
	public String stringDiscografica() {
		String res="";
		for(Disco cd : discografica) {
			res+=cd.toString()+" ";
		}
		return res;
	}

}
