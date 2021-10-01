package Ruiz_Delgado_Andres;

public class Vehiculo {

    private String colorvehiculo;
    private int numruedas;
    private double potencia;
    private String matricula;
    private double cilindrada;


    public Vehiculo(String colorvehiculo, int numruedas, String matricula) {
        this.colorvehiculo = colorvehiculo;
        this.numruedas = numruedas;
        this.matricula = matricula;
    }

    public Vehiculo(String colorvehiculo, int numruedas, String matricula, double cilindrada) {
        this.colorvehiculo = colorvehiculo;
        this.numruedas = numruedas;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public Vehiculo(String colorvehiculo, int numruedas, double potencia, String matricula, double cilindrada) {
        this.colorvehiculo = colorvehiculo;
        this.numruedas = numruedas;
        this.potencia = potencia;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getColorvehiculo() {
        return colorvehiculo;
    }

    public int getNumruedas() {
        return numruedas;
    }

    public String getMatricula() {
        return matricula;
    }

}