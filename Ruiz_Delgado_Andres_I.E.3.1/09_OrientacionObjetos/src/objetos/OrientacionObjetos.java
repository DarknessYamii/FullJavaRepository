/**
 * 
 */
package objetos;

/**
 * @author DAM
 *
 */
public class OrientacionObjetos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona(); 
		
		persona.caminar();
		persona.hablar();
		persona.caminar();
		persona.morir();
		
		persona2.nacer();
		
		persona3.caminar();
		
	}

}