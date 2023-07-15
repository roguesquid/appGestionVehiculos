package gui.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import logica.Vehiculos;
import logica.main;

public class Listar extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Listar() {
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);
		
		JLabel lblListarVehiculos = new JLabel("Listar Vehiculos");
		lblListarVehiculos.setBounds(64, 96, 403, 56);
		lblListarVehiculos.setFont(new Font("Public Sans", Font.BOLD, 48));
		background.add(lblListarVehiculos);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBounds(64, 164, 133, 4);
		headingSeparator.setBackground(new Color(7, 10, 19));
		background.add(headingSeparator);
		
		JLabel lblVehiculosDisponibles = new JLabel("Vehiculos Disponibles");
		lblVehiculosDisponibles.setBounds(64, 228, 338, 38);
		lblVehiculosDisponibles.setFont(new Font("Public Sans", Font.BOLD, 32));
		background.add(lblVehiculosDisponibles);
		
		JPanel separadorSubtitulo = new JPanel();
		separadorSubtitulo.setBounds(65, 274, 133, 2);
		separadorSubtitulo.setBackground(new Color(7, 10, 19));
		background.add(separadorSubtitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 306, 1279, 497);
		background.add(scrollPane);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Nombre en Inglés");
		modelo.addColumn("Nombre Conductores");
		modelo.addColumn("Tamaño del Caucho");
		modelo.addColumn("Tipo de Caucho");
		modelo.addColumn("Velocidad Km/h");
		modelo.addColumn("Velocidad");
		modelo.addColumn("R. Obstáculos");
		modelo.addColumn("R. Líquidos");
		modelo.addColumn("R. Explosivos");
		llenarTabla(modelo);
		JTable table = new JTable(modelo);
		scrollPane.setViewportView(table);
		

	}
	
	private void llenarTabla(DefaultTableModel modelo) {
		
		Vehiculos vehiculoActual = main.lista.getPrimero();
		while (vehiculoActual != null) {
		    Object[] fila = new Object[10];
		    fila[0] = vehiculoActual.getNombre();
		    fila[1] = vehiculoActual.getNombreIngles();
		    fila[2] = vehiculoActual.getNombreConductores();
		    fila[3] = vehiculoActual.getTamanoCaucho();
		    fila[4] = vehiculoActual.getTipoDeCaucho();
		    fila[5] = vehiculoActual.getVelocidad();
		    fila[6] = vehiculoActual.getVelocidadString();
		    fila[7] = vehiculoActual.getResistenciaObstaculos();
		    fila[8] = vehiculoActual.getResistenciaLiquido();
		    fila[9] = vehiculoActual.getResistenciaExplosivos();
		    
		    modelo.addRow(fila);
		    
		    vehiculoActual = vehiculoActual.getProx();
		}

	}
}
