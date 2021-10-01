package FirstWindowSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Operadores implements ActionListener {

//	 EventManagement em = new EventManagement();
//    JButton jSource1 = em.Boton1;
//    JButton jSource2 = em.Boton2;
//    JButton jSource3 = em.Boton3;
//
@Override
public void actionPerformed(ActionEvent e) {
	JButton source = (JButton) e.getSource();
	source.setBackground(Color.blue);
//	EventManagement em = new EventManagement();
//	JButton b1 = em.Boton1;
//	b1.setBackground(Color.BLUE);


//		jSource1.setBackground(Color.BLUE);
//		jSource1.setForeground(Color.RED);
//		jSource2.setBackground(Color.yellow);
}

}
