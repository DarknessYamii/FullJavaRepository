package PracticaDeAbstractos;

public class CuentaAhorro extends Cuenta {

	private double interes;
	private long sueldoMinimo = 650;
	public CuentaAhorro(long numerocuenta, Persona cliente, double interes, long sueldoMinimo) {
		super(numerocuenta, cliente);
		this.interes = interes;
		this.sueldoMinimo = sueldoMinimo;
	}
	@Override
	public void retirarDinero(double Saldo) {
		// TODO Auto-generated method stub
		
	}
	
}
