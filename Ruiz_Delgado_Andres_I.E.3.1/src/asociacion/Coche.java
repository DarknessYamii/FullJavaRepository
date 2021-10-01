package asociacion;

public class Coche {
	// Atributos
	private Motor motor = null;
	private String marca = null;
	private String modelo = null;
	private double importeAveria;

	// Constructor
	public Coche(String ma, String mo) {
		motor = new Motor(50);
		marca = ma;
		modelo = mo;
		importeAveria =0;
	}

	// Getters
	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getImporteAveria() {
		return importeAveria;
	}

	public void acumularAveria(double d) {
		importeAveria += d;
	}
}
