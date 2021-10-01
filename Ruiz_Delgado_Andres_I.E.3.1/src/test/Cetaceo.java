package test;

public class Cetaceo extends Mamifero{
public Cetaceo (String h){
super(h);
}
public Cetaceo(){
this("acuático");
}
public String tipo(){
return super.tipo()+ " (cetáceo)";
}
public static void imprimirTipo(Mamifero m){
System.out.println(m.tipo());
}

}
