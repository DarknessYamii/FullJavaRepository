package Biblioteca;



public class Libro {
	
	private String titulo, autor;
	private Socio prestado;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Socio getPrestado() {
		return prestado;
	}
	public void setPrestado(Socio prestado) {
		this.prestado = prestado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((prestado == null) ? 0 : prestado.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (prestado == null) {
			if (other.prestado != null)
				return false;
		} else if (!prestado.equals(other.prestado))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	
	}
	public Libro(String titulo, String autor, Socio prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = prestado;
	}
	

}
