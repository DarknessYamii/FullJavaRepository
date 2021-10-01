package herencia;

/**
 * Clase heredada
 * @author DAM
 *@see Personajes
 */
public class Guerreros extends Personajes {

	private String arma;

	/**
	 * Constructor heredado
	 * @param nombre
	 * @param arma
	 * @param energia
	 */
	public Guerreros(String nombre, String arma, int energia) {
        super(nombre, energia);
        this.arma=arma;
    } 
    
    /**
     * Metodo que resta la cantidad de energia que le indicamos, dando la 
     * informacion de los demas atributos. Y el arma elegida.
     * @param energia
     * @return String combatir
     */
    public String combatir (int energia) {
    	setEnergia(energia); //this.energia-=energia;
    	return "El guerrero "+getNombre()+" ha realizado un ataque con su arma "+arma+" y ha gastado "
    			+energia+" energia, le queda "+getEnergia()+" energia para atacar"; 
    }
    
}
