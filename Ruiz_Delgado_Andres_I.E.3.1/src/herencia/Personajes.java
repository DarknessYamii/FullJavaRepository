package herencia;


public class Personajes {

	private String nombre; 
    private int energia; 
    
    /**
     * Constructor 
     * @param nombre
     * @param energia
     */
    Personajes (String nombre, int energia) {
        this.nombre=nombre;
        this.energia=energia;
    }

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia -= energia;
    }
        
    /**
     * Metodo para incrementar el nivel de energia
     * @param energia
     */
    public void alimentarse (int energia) {
        this.energia+=energia;
    }
}
