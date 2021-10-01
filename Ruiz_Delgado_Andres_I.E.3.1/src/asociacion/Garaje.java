package asociacion;

public class Garaje {
	// Atributos
	private Coche coche = null;
	private String averia = null;
	private int numCochesAtendidos = 0;

	public int getNumCochesAtendidos() {
		return numCochesAtendidos;
	}

	public boolean aceptarCoche(Coche c, String a) {
		if (coche != null) {
			return false;
		}
		coche = c;
		averia = a;
		
		if (averia.equals("aceite")) {
			coche.getMotor().setAceite(coche.getMotor().getAceite() + 10);
		}
		
		coche.acumularAveria(Math.random());
		numCochesAtendidos++;
		return true;
	}

	public void devolverCoche() {
		coche = null;
		averia = null;
	}
}
