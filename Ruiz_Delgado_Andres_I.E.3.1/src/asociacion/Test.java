package asociacion;

public class Test {
	public static void main(String[] args) {
		
		Coche c1 = new Coche("Fiat", "Cinquecento");
		Coche c2 = new Coche("Renault", "Clio");
		Garaje g = new Garaje();
		
		System.out.println("Número de coches atendidos: " + g.getNumCochesAtendidos());
		
		if (!g.aceptarCoche(c1, "Pinchazo de una rueda")) {
			System.out.println("Ya están atendiendo a otro coche");
		}
		
		if (!g.aceptarCoche(c1, "Se ha quedado sin gasolina")) {
			System.out.println("Ya están atendiendo a otro coche y no van a coger el nuestro");
		}
		
		g.devolverCoche();
		
		if (!g.aceptarCoche(c2, "Gripazo del motor")) {
			System.out.println("Ya están atendiendo a otro coche");
		} else { // Pasara un tiempo
			g.devolverCoche();
		}
		
		if (!g.aceptarCoche(c2, "aceite")) {
			System.out.println("Ya están atendiendo a otro coche");
		} else { // Pasara un tiempo
			g.devolverCoche();
		}
		
		if (!g.aceptarCoche(c2, "aceite")) {
			System.out.println("Ya están atendiendo a otro coche");
		} else {
			g.devolverCoche();
		}
		
		System.out.println("Numero de coches atendidos: " + g.getNumCochesAtendidos());
		System.out.println(" Coche 1 Averia " + c1.getImporteAveria() + " Aceite " + c1.getMotor().getAceite());
		System.out.println(" Coche 2 Averia " + c2.getImporteAveria() + " Aceite " + c2.getMotor().getAceite());
	
	}
}