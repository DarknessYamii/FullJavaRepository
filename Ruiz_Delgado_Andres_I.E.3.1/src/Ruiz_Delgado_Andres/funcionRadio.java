package Ruiz_Delgado_Andres;
/**
 * Funcion main de Radio
 * @author andre
 *
 */
public class funcionRadio {

	public static void main(String[] args) {
		Radio r = new Radio();
		r.reset();
		r.up_hez();
		r.up_hez();
		r.down_hez();
		r.displayRadio();
		r.up_vol();
		r.displayRadio();
		r.changeCanal();
		r.displayRadio();
		r.up_hez();
		r.displayRadio();
	}

}
