package herencia;

public class Main_personajes {

	public static void main(String[] args) {
		
		//Creamos un mago y un guerrero con los atributos que queramos
		Guerreros guerrero = new Guerreros ("Conan", "machete",1500);         
        Mago mago = new Mago ("Gandalf", "Bola de fuego");    
        
        //Llamamos al metodo combatir y posteriormente le alimentamos
        System.out.println(guerrero.combatir(1900));
        guerrero.alimentarse(900);
        
        //Comprobamos si se ha alimentado
        System.out.println("El guerrero tiene actualmente "+guerrero.getEnergia()+" energia");        
        //Comprobamos el ataque del mago   
        System.out.println(mago.encantar()); 
        System.out.println(mago.encantar());
        System.out.println(mago.encantar());
    }

}