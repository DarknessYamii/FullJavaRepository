package FirstWindowSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Actions extends EventManagement implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
			JButton sourceButton = (JButton) e.getSource();
			sourceButton.setBackground(Color.black);
			sourceButton.setForeground(Color.white);
			sourceButton.getParent().setBackground(Color.blue);

	}
}