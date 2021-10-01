package PracticaDeAbstractos;

public class CuentaCorriente extends Cuenta{

	private double interes = 1.5;

	public CuentaCorriente(long numerocuenta, Persona cliente, double interes) {
		super(numerocuenta, cliente);
		this.interes = interes;
	}

	@Override
	public void retirarDinero(double Saldo) {
		if(Saldo>getSaldo()) {
			System.out.println("Dinero insuficiente");
		}else {
			double dinero = getSaldo();
			dinero -= Saldo;
			setSaldo(dinero);
			
		}
		
	}
	@Override
	public void ingresarDinero(double saldo) {
		// TODO Auto-generated method stub
		super.ingresarDinero(saldo);
	}
	
	@Override
	public void actualizarSaldo() {
		// TODO Auto-generated method stub
		super.actualizarSaldo();
	}

	
}
