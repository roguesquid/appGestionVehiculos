package gui.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Principal extends JPanel {

	/**
	 * Create the panel.
	 */
	public Principal() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon("./src/resources/mainIllustration.png"));
		icon.setBounds(585, 336, 418, 482);
		background.add(icon);
		
		JLabel heading = new JLabel("Bienvenido a la Aplicacion de Gestion de Vehiculos!");
		heading.setFont(new Font("Public Sans", Font.BOLD, 48));
		heading.setBounds(64, 96, 1174, 56);
		background.add(heading);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBackground(new Color(7, 10, 19));
		headingSeparator.setBounds(64, 164, 133, 4);
		background.add(headingSeparator);

	}
}
