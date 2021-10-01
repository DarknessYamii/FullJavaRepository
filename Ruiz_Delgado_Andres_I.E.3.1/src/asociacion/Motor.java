package asociacion;

public class Motor {
	// Atributos
	private int aceite = 0;
	private int CV = 0;

	// Constructor
	public Motor(int c) {
		CV = c;
	}

	// Getters
	public int getAceite() {
		return aceite;
	}

	public int getCV() {
		return CV;
	}

	// Setters
	public void setAceite(int a) {
		aceite = a;
	}
}
