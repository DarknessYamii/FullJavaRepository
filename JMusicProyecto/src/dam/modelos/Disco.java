package dam.modelos;

public class Disco implements Comparable<Disco>{
	
	public String nombreCD;
	public String anioPublicacion;
	
	public Disco() {}
	
	public Disco(String nombre, String anio) {
		this.nombreCD=nombre;
		this.anioPublicacion=anio;
	}

	public String getNombreCD() {
		return nombreCD;
	}

	public void setNombreCD(String nombreCD) {
		this.nombreCD = nombreCD;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "'"+nombreCD+"'" + " en el " + anioPublicacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anioPublicacion == null) ? 0 : anioPublicacion.hashCode());
		result = prime * result + ((nombreCD == null) ? 0 : nombreCD.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disco other = (Disco) obj;
		if (anioPublicacion == null) {
			if (other.anioPublicacion != null)
				return false;
		} else if (!anioPublicacion.equals(other.anioPublicacion))
			return false;
		if (nombreCD == null) {
			if (other.nombreCD != null)
				return false;
		} else if (!nombreCD.equals(other.nombreCD))
			return false;
		return true;
	}
	
	public int compareTo(Disco o) {
		if(!this.nombreCD.equals(o.nombreCD)) {
			return this.nombreCD.compareTo(o.nombreCD);
		} else {
			return this.anioPublicacion.compareTo(o.anioPublicacion);
		}
	}

}
