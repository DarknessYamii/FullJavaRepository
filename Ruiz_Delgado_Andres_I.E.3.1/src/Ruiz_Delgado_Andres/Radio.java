package Ruiz_Delgado_Andres;
/**
 * OBJETO RADIO
 * @author andre
 *
 */
public class Radio {
/**
 * @param frecuencia
 * @param volumen
 * @param canal
 */
	private double frecuencia;
	private int volumen;
	private String canal ="FM";
	
	public Radio() { //Iniciamos radio con un reset que sera FM 
		reset();
	}

	public void up_hez() { //Subira la frecuencia con sus respectivos Hz
		if (this.canal == "FM") {
			if( frecuencia>=30 && frecuencia<=80) {
				frecuencia+=5;
				if(frecuencia>=80) {
					System.out.println("La frecuencia ya es 80, el max");
					frecuencia =80;
				}
			
			}else {
				System.out.println("La frecuencia ya es 80, el max");
				frecuencia = 80;
				}
		}else {
			if(this. frecuencia>=10 && this.frecuencia<=40) {
				this.frecuencia+=3;
				if(frecuencia>=40) {
					System.out.println("La frecuencia ya es 40, el max");
					frecuencia =40;
				}
			}else {
				System.out.println("La frecuencia ya es 40, el max");
				frecuencia = 40;
			}
		}
	}
	public void down_hez() { //Bajara la frecuencia con sus respectivos Hz
		if (canal == "FM") {
			if( frecuencia>=30 && frecuencia<=80) {
				frecuencia-=5;
				if(frecuencia<=30) {
					System.out.println("La frecuencia ya es 30, el min");
					frecuencia =30;
				}
			}else {
				System.out.println("La frecuencia ya es 30, el min");
			}
		}else {
			if( frecuencia>=10 && frecuencia<=40) {
				frecuencia-=3;
				if(frecuencia<=10) {
					System.out.println("La frecuencia ya es 10, el min");
					frecuencia =10;
				}
			}else {
				System.out.println("La frecuencia ya es 10, el min");
				frecuencia = 10;
			}
		}
	}
	
	public void down_vol() {//Bajara el volumen segun su frecuencia con sus respectivos dB
		if (canal == "FM") {
			if( volumen>=0 && volumen<=20) {
				volumen-=5;
				if (volumen<=0) { //Control de volumen minimo
					System.out.println("Esta por debajo de 0 el volumen no es posible");
					volumen = 0;}
			}else {
				System.out.println("El volumen ya es 0, el min");
				volumen = 0;
			}
		}else {
			if( volumen>=3 && volumen<=18) {
				volumen-=2;
				if (volumen<=3) {
					System.out.println("Esta por debajo de 0 el volumen no es posible");
					volumen =3;
				}
			}else {
				System.out.println("El volumen ya es 0, el min");
				volumen = 3;
			}
		}
	}
	public void up_vol() { //Subira el volumen segun su frecuencia con sus respectivos dB
		if (canal == "FM") {
			if( volumen>=0 && volumen<=20) {
				volumen+=5;
				if (volumen>=20) { //Control de volumen 
					System.out.println("Esta por encima de 20 el volumen no es posible");
					volumen=20;
				}
			}else {
				System.out.println("El volumen ya es 20, el max");
			}
		}else {
			if( volumen>=3 && volumen<=18) {
				volumen+=2;
				if (volumen>=18) {
					System.out.println("Esta por encima de 20 el volumen no es posible");
					volumen =18;
				}
			}else {
				System.out.println("El volumen ya es 18, el max");
				volumen = 18;
			}
		}
	}
	
	public void displayRadio() {
		System.out.println("El canal es "+canal+ " su volumen "+volumen+ " y la frecuencia actual "+frecuencia); 
	}
	
	public void changeCanal() { //Cambia el canal con los valores por defectos de cada uno
		if (canal == "FM") {
			canal = "AM";
			frecuencia = 10;
			volumen=3;
		}else {
			canal = "FM";
			frecuencia = 30;
			volumen = 0;
		}
	}
	
	public void reset() {  //Resetea los valores del canal segun si es FM o AM
        if (canal == "FM") {
            this.canal = "FM";
            this.frecuencia = 30;
            this.volumen = 0;

        }
        else{
            this.canal = "AM";
            this.frecuencia = 10;
            this.volumen = 3;
        }
	}
}

