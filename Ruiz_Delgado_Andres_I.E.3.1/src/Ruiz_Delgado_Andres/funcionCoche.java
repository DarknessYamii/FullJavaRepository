package Ruiz_Delgado_Andres;
/**
 * Funcion main de Coche, Moto y Vehiculo
 * @author andre
 *
 */
public class funcionCoche {

	public static void main(String[] args) {
		Coche c = new Coche("Gris Plata",3, "0000BBB");
		Moto m = new Moto("Negro", 2, "2222BBB");
		System.out.println(c.toString());
		System.out.println(m.toString());

	}

}
