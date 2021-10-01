package FirstWindowSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ManejadorEventos.Actions;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;

public class EventManagement extends JFrame {

	 JPanel contentPane;
		JButton Boton1;
		JButton Boton2;
		JButton Boton3;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventManagement frame = new EventManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EventManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[1px]", "[1px]"));
		Boton1.setVerticalAlignment(SwingConstants.BOTTOM);
		Boton1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(Boton1, "cell 0 0,grow");
		contentPane.add(Boton2, "cell 0 0,grow");
		contentPane.add(Boton3, "cell 0 0,grow");
		Boton1 = new JButton("Boton1");
		Boton2 = new JButton("Boton2");
		Boton3 = new JButton("Boton3");
		Boton1.addActionListener(new Operadores());
	}

}
