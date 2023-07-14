package gui.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

public class Agregar extends JPanel {
	private JTextField textFieldNombre;
	private JTextField textFieldNombreIngles;
	private JTextField textFieldConductores;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Agregar() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);
		
		JLabel heading = new JLabel("Agregar Vehiculo");
		heading.setBounds(64, 96, 403, 56);
		heading.setFont(new Font("Public Sans", Font.BOLD, 48));
		background.add(heading);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBounds(64, 164, 133, 4);
		headingSeparator.setBackground(new Color(7, 10, 19));
		background.add(headingSeparator);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(64, 314, 74, 16);
		labelNombre.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		background.add(labelNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(64, 346, 232, 24);
		textFieldNombre.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		background.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel labelNombreIngles = new JLabel("Nombre en ingles");
		labelNombreIngles.setBounds(344, 314, 167, 19);
		labelNombreIngles.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		background.add(labelNombreIngles);
		
		textFieldNombreIngles = new JTextField();
		textFieldNombreIngles.setBounds(344, 346, 232, 24);
		textFieldNombreIngles.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		textFieldNombreIngles.setColumns(10);
		background.add(textFieldNombreIngles);
		
		JLabel labelConductores = new JLabel("Conductores");
		labelConductores.setBounds(624, 314, 119, 16);
		labelConductores.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		background.add(labelConductores);
		
		textFieldConductores = new JTextField();
		textFieldConductores.setBounds(624, 346, 232, 24);
		textFieldConductores.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		textFieldConductores.setColumns(10);
		background.add(textFieldConductores);
		
		JLabel labelSubtitulo1 = new JLabel("Datos Basicos");
		labelSubtitulo1.setBounds(64, 228, 225, 38);
		labelSubtitulo1.setFont(new Font("Public Sans", Font.BOLD, 32));
		background.add(labelSubtitulo1);
		
		JPanel separadorSubtitulo = new JPanel();
		separadorSubtitulo.setBounds(64, 274, 133, 2);
		separadorSubtitulo.setBackground(new Color(7, 10, 19));
		background.add(separadorSubtitulo);
		
		JPanel separadorSubtitulo_1 = new JPanel();
		separadorSubtitulo_1.setBounds(64, 464, 133, 2);
		separadorSubtitulo_1.setBackground(new Color(7, 10, 19));
		background.add(separadorSubtitulo_1);
		
		JLabel labelSubtitulo1_1 = new JLabel("Caracteristicas");
		labelSubtitulo1_1.setBounds(64, 418, 243, 38);
		labelSubtitulo1_1.setFont(new Font("Public Sans", Font.BOLD, 32));
		background.add(labelSubtitulo1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 504, 805, 233);
		background.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "Perezoso", "Monster Truck 1", "Todo Terreno", new Integer(140)},
				{null, "Perezoso", "Monster Truck 2", "Todo Terreno", new Integer(120)},
				{null, "Perezoso", "Monster Truck 3", "Todo Terreno", new Integer(110)},
				{null, "Perezoso", "Monster Truck 4", "Todo Terreno", new Integer(100)},
				{null, "Perezoso", "Monster Truck 5", "Todo Terreno", new Integer(80)},
				{null, "Perezoso", "Normales", "Normales", new Integer(120)},
				{null, "Crucero", "Normales", "Normales", new Integer(140)},
				{null, "El super ferrari", "Pegado al piso", "Anti coleo", new Integer(160)},
				{null, "Delorean", "Pegado al piso", "Anti coleo", new Integer(180)},
			},
			new String[] {
				"Seleccione", "Velocidad", "Tama\u00F1o Caucho", "Tipo caucho", "Velocidad Km/h"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(table);
		
		JLabel labelSubtitulo1_1_1 = new JLabel("Resistencias");
		labelSubtitulo1_1_1.setFont(new Font("Public Sans", Font.BOLD, 32));
		labelSubtitulo1_1_1.setBounds(956, 228, 243, 38);
		background.add(labelSubtitulo1_1_1);
		
		JPanel separadorSubtitulo_1_1 = new JPanel();
		separadorSubtitulo_1_1.setBackground(new Color(7, 10, 19));
		separadorSubtitulo_1_1.setBounds(956, 274, 133, 2);
		background.add(separadorSubtitulo_1_1);
		
		JLabel lblLiquidos = new JLabel("Liquidos (10-35)");
		lblLiquidos.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblLiquidos.setBounds(956, 314, 148, 16);
		background.add(lblLiquidos);
		
		JLabel lblObstaculos = new JLabel("Obstaculos (5-40)");
		lblObstaculos.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblObstaculos.setBounds(1220, 314, 167, 19);
		background.add(lblObstaculos);
		
		JLabel lblBombas = new JLabel("Bombas (5-35)");
		lblBombas.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblBombas.setBounds(956, 402, 148, 16);
		background.add(lblBombas);
		
		JSpinner spinnerLiquidos = new JSpinner();
		spinnerLiquidos.setModel(new SpinnerNumberModel(10, 10, 35, 1));
		spinnerLiquidos.setBounds(956, 346, 148, 22);
		background.add(spinnerLiquidos);
		
		JSpinner spinnerObstaculos = new JSpinner();
		spinnerObstaculos.setModel(new SpinnerNumberModel(5, 5, 40, 1));
		spinnerObstaculos.setBounds(1220, 346, 148, 22);
		background.add(spinnerObstaculos);
		
		JSpinner spinnerBombas = new JSpinner();
		spinnerBombas.setModel(new SpinnerNumberModel(5, 5, 35, 1));
		spinnerBombas.setBounds(956, 434, 148, 22);
		background.add(spinnerBombas);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setEnabled(false);
		btnAgregar.setBounds(956, 500, 200, 40);
		background.add(btnAgregar);
	}
}
