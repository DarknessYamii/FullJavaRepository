package herencia;

/**
 * 
 * @author DAM
 * @see Personajes
 */
public class Mago extends Personajes {

private String poder;    
    
	/**
	 * Constructor heredado que establece la energia del mago en 100 de forma predeterminada
	 * ademas de recibir el nombre y su poder
	 * @param nombre
	 * @param poder
	 */
    public Mago(String nombre, String poder) {
        super(nombre, 100);
        this.poder=poder;
        
    } 
    
    /**
     * Metodo de ataque del mago que retorna el ataque realizado. 
     * Todos sus ataques siempre gastan 2 de energia
     * @return Accion realziada por el mago
     */
    public String encantar () {
        setEnergia(2);;
        return "El mago "+getNombre()+" ha utilizado su poder "+poder+" y ha gastado 2 de energia, "
        		+ "aun le quedan "+getEnergia();
    }
}