package Ruiz_Delgado_Andres;
/**
 * Objeto Moto que extiende de Vehiculo
 * @author andre
 *
 */

public class Moto extends Vehiculo {
/**
 * @param numPlazas
 */
    private int numPlazas;

    public Moto(String colorvehiculo, int numruedas, String matricula) { //Constructor que inicia Moto con su color, sus ruedas y su matricula
        super(colorvehiculo, numruedas, matricula);
    }

    public Moto(String colorvehiculo, int numruedas, String matricula, double cilindrada) {//Constructor que inicia Moto con su color, sus ruedas y su matricula y su cilindrada
        super(colorvehiculo, numruedas, matricula, cilindrada);
    }

    public Moto(String colorvehiculo, int numruedas, double potencia, String matricula, double cilindrada) {//Constructor que inicia Moto con su color, sus ruedas y su matricula, su cilindrada, su potencia
        super(colorvehiculo, numruedas,  matricula, cilindrada);

    }

    public Moto(String colorvehiculo, int numruedas, double potencia, String matricula, double cilindrada, int numPlazas) { //Constructor que inicia Moto con su color, sus ruedas y su matricula, su cilindrada, su potencia y sus plazas
        super(colorvehiculo, numruedas, potencia, matricula, cilindrada);
        this.numPlazas = numPlazas;
    }
    public String toString() { //Imprime los valores de la moto
        return "La matricula de la moto es " +this.getMatricula()+ " el color del coche es "+this.getColorvehiculo()+ " y tiene "+numPlazas+ " plazas";
    }


}