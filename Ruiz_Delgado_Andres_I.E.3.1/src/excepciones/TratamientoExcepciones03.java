/**
 * 
 */
package excepciones;

/**
 * @author DAM
 *
 */
public class TratamientoExcepciones03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int a = 2;
			int b = 0;
			//int resultado = a/b;
			String mensaje = null;
			System.out.println(mensaje.length()); 		
		} catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.err.println("Error: " + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("Se ha producido un error no esperado");
		}
		

	}

}
