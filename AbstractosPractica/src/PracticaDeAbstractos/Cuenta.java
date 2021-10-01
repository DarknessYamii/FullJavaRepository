package PracticaDeAbstractos;

public abstract class Cuenta {

	private long numerocuenta;
	private double saldo;
	private Persona cliente;

	/** : atributo de la clase Persona (que tiene nombre y apellidos, y NIF). */

	/**
	 * • Constructor parametrizado que recibe un cliente y un número de cuenta •
	 * Accedentes para los tres atributos • ingresar(double): permitirá ingresar una
	 * cantidad en la cuenta. • abstract retirar(double): permitirá sacar una
	 * cantidad de la cuenta (si hay saldo). No se implementa, depende del tipo de
	 * cuenta //• actualizarSaldo(): actualizará el saldo de la cuenta, pero cada
	 * cuenta lo hace de una forma diferente
	 * 
	 */
	
	
	public void ingresarDinero(double saldo) {
		double dinero = getSaldo();
		dinero += saldo;
		setSaldo(dinero);
		
	}
	abstract public void retirarDinero(double Saldo);
	
	public void actualizarSaldo() {
		System.out.println(getSaldo());
	}
	
	public Cuenta(long numerocuenta, Persona cliente) {
		super();
		this.numerocuenta = numerocuenta;
		this.cliente = cliente;
		this.saldo = 0;
	}

	public long getNumerocuenta() {
		return numerocuenta;
	}

	public void setNumerocuenta(long numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

}
