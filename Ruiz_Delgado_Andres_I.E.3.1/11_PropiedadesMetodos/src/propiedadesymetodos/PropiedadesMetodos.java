/**
 *  PROPIEDADES Y M�TODOS DE UNA CLASE
 */
package propiedadesymetodos;


/**
 * @author DAM
 *
 */

public class PropiedadesMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.presentacion();
		
		p.setNombre("Pepe");
		p.setApellidos("Perez");
		p.setAltura(180);
		p.setEdad(25);
		p.setPeso(75.5f);
		
		p.presentacion();
		
		System.out.println(p);

	}

}
