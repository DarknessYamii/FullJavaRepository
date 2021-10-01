
package videojuegos;

/**
 * Objeto Personaje la cual contiene las class Personaje,Guerrero y Magos
 * @author andre
 *
 */
public class Personaje {

/**
 * 
 */
	private String nombre;
	protected int nivel_energia;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public int getNivel_energia() {
		return nivel_energia;
	}

	public void setNivel_energia(int n_e) {
		this.nivel_energia = n_e;
	}
	
	public Personaje(String n, int n_e) {
		this.nombre = n;
		this.nivel_energia = n_e;
	}
	
	public int Alimentarse() {
		int cantidad_energia = 10;
		this.nivel_energia = cantidad_energia + nivel_energia;
		return nivel_energia;
		}

}
	class Guerreros extends Personaje{
		private String arma;
		public String getArma() {
			return arma;
		}
		public void setArma(String arma) {
			this.arma = arma;
		}
		public Guerreros(String n, int n_e,String arma) {
			super(n, n_e);
			this.arma = arma;
		}
		public void Combatir() {
			int cantidad_energia = 5;
			if(nivel_energia>=cantidad_energia) {
			this.nivel_energia = nivel_energia - cantidad_energia;
		    System.out.println("El arma usada fue "+arma+ " y la cantidad de energia usada en el ataque fue "+cantidad_energia+" te queda "+nivel_energia+" puntos de energia");
			}else{
				System.out.println("No tienes energia");
			}
		}
		
	}
	
	class Magos extends Personaje{
		private String poder;
		public String getPoder() {
			return poder;
		}

		public void setPoder(String poder) {
			this.poder = poder;
		}

		public Magos(String n, String poder, int n_e) {
			super(n,n_e);
			this.poder = poder;
			nivel_energia = 100;
		}
		
		public void Encantar() {
			int cantidad_energia = 13;
			if(nivel_energia>=cantidad_energia) {
			nivel_energia = nivel_energia - cantidad_energia;
			System.out.println("Tras lanzar el Encantamiento "+poder+" la energia a disminuido a "+nivel_energia);
			}else {
				System.out.println("No tienes energia");
			}
		}
	}
	


