package Ruiz_Delgado_Andres;
/**
 * Objeto Coche que extiende de Vehiculo
 * @author andre
 *
 */
public class Coche extends Vehiculo {
/**
 * @param numPuertas
 */
    private int numPuertas;

    public Coche(String colorvehiculo, int numruedas, String matricula) { //Constructor coche que inicia color, ruedas y matricula
        super(colorvehiculo, numruedas, matricula);
    }

    public Coche(String colorvehiculo, int numruedas, String matricula, double cilindrada) {  //Constructor coche que inicia color, ruedas , matricula y cilindradas
        super(colorvehiculo, numruedas, matricula, cilindrada);
    }

    public Coche(String colorvehiculo, int numruedas, double potencia, String matricula, double cilindrada) { //Constructor coche que inicia color, ruedas , matricula, potencia y cilindradas
        super(colorvehiculo, numruedas,  matricula, cilindrada);

    }

    public Coche(String colorvehiculo, int numruedas, double potencia, String matricula, double cilindrada, int numPuertas) { //Constructor coche que inicia color, ruedas , matricula, potencia , cilindradas y numeros de puertas
        super(colorvehiculo, numruedas, potencia, matricula, cilindrada);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String toString() { //Imprime los valores del coche
        return "La matricula del coche es " +this.getMatricula()+ " el color del coche es "+this.getColorvehiculo()+ " y tiene "+numPuertas+ " plazas";
    }


}


