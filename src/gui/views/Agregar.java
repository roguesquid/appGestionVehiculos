package gui.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import logica.ListaVehiculos;
import logica.Vehiculos;
import logica.main;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SpinnerNumberModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Agregar extends JPanel {
	private static ListaVehiculos lista = main.lista;
	private JTextField textFieldNombre;
	private JTextField textFieldNombreIngles;
	private JTextField textFieldConductores;
	private JTable table;
	private String filePath;

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
						{ new Integer(1), "Perezoso", "Monster Truck 1", "Todo Terreno", new Integer(140) },
						{ new Integer(2), "Perezoso", "Monster Truck 2", "Todo Terreno", new Integer(120) },
						{ new Integer(3), "Perezoso", "Monster Truck 3", "Todo Terreno", new Integer(110) },
						{ new Integer(4), "Perezoso", "Monster Truck 4", "Todo Terreno", new Integer(100) },
						{ new Integer(5), "Perezoso", "Monster Truck 5", "Todo Terreno", new Integer(80) },
						{ new Integer(6), "Perezoso", "Normales", "Normales", new Integer(120) },
						{ new Integer(7), "Crucero", "Normales", "Normales", new Integer(140) },
						{ new Integer(8), "El super ferrari", "Pegado al piso", "Anti coleo", new Integer(160) },
						{ new Integer(9), "Delorean", "Pegado al piso", "Anti coleo", new Integer(180) },
				},
				new String[] {
						"Tipo", "Velocidad", "Tama\u00F1o Caucho", "Tipo caucho", "Velocidad Km/h"
				}) {
			Class[] columnTypes = new Class[] {
					Integer.class, Object.class, String.class, String.class, Integer.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false
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

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		spinner.setBounds(253, 776, 58, 22);
		background.add(spinner);

		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo");
		lblSeleccioneElTipo.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblSeleccioneElTipo.setBounds(64, 777, 167, 16);
		background.add(lblSeleccioneElTipo);

		JLabel lblBrowse = new JLabel("Seleccione el icono del Vehiculo:");
		lblBrowse.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblBrowse.setBounds(64, 835, 306, 16);
		background.add(lblBrowse);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(378, 832, 89, 23);
		background.add(btnBrowse);
		btnBrowse.addActionListener(e -> {
			JFileChooser fileChooser = new JFileChooser();
			int result = fileChooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				// Seleccionar archivo
				java.io.File selectedFile = fileChooser.getSelectedFile();
				filePath = selectedFile.getAbsolutePath();
			}
		});

		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(filePath));
		lblIcono.setBounds(64, 870, 50, 50);
		background.add(lblIcono);

		textFieldNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				verificaciones(textFieldNombre, textFieldNombreIngles, textFieldConductores, btnAgregar);
			}
		});
		textFieldNombreIngles.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				verificaciones(textFieldNombre, textFieldNombreIngles, textFieldConductores, btnAgregar);
			}
		});
		textFieldConductores.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				verificaciones(textFieldNombre, textFieldNombreIngles, textFieldConductores, btnAgregar);
			}
		});
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lista.nombreValido(textFieldNombre.getText())
						&& lista.nombreConductoresValido(textFieldConductores.getText())
						&& lista.nombreInglesValido(textFieldNombreIngles.getText())) {
					agregar(textFieldNombre, textFieldNombreIngles, textFieldConductores, spinner, table, spinnerLiquidos,
							spinnerObstaculos, spinnerBombas, btnAgregar);
				} else if (lista.strignVacio(textFieldNombre.getText())) { // si nombre esta vacio
					JOptionPane.showMessageDialog(null, "No se pudo crear, no se puede crear un vehiculo sin nombre", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (lista.existeNombre(textFieldNombre.getText())) { // si el nombre existe
					JOptionPane.showMessageDialog(null, "No se pudo crear, ya hay un vehículo con el mismo nombre", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (!lista.nombreInglesValido(textFieldNombreIngles.getText())) { // si no tiene nombre en ingles
					JOptionPane.showMessageDialog(null, "No se pudo crear, no tiene nombre en ingles", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (!lista.nombreConductoresValido(textFieldConductores.getText())) { // si no tiene conductores
					JOptionPane.showMessageDialog(null, "No se pudo crear, el vehiculo no tiene conductores", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	public void mostrarVehiculoOptionPane(Vehiculos vehiculo) {
		String mensaje = "Vehiculo Agregado satisfactoriamente " +
				"\n\nNombre: " + vehiculo.getNombre() +
				"\nNombre en Inglés: " + vehiculo.getNombreIngles() +
				"\nNombre Conductores: " + vehiculo.getNombreConductores() +
				"\nTamaño Caucho: " + vehiculo.getTamanoCaucho() +
				"\nTipo Caucho: " + vehiculo.getTipoDeCaucho() +
				"\nVelocidad: " + vehiculo.getVelocidad() +
				"\nVelocidad (String): " + vehiculo.getVelocidadString() +
				"\nResistencia a Obstáculos: " + vehiculo.getResistenciaObstaculos() +
				"\nResistencia a Líquidos: " + vehiculo.getResistenciaLiquido() +
				"\nResistencia a Explosivos: " + vehiculo.getResistenciaExplosivos();

		JOptionPane.showMessageDialog(null, mensaje, "Detalles del Vehículo", JOptionPane.INFORMATION_MESSAGE);
	}

	private boolean verificaciones(JTextField textFieldNombre, JTextField textFieldNombreIngles,
			JTextField textFieldConductores, JButton button) {
		String nombre = textFieldNombre.getText();
		String nombreIngles = textFieldNombreIngles.getText();
		String conductores = textFieldConductores.getText();

		if (lista.nombreValido(nombre) && lista.nombreInglesValido(nombreIngles)
				&& lista.nombreConductoresValido(conductores)) {
			button.setEnabled(true);
		}
		return false;
	}

	private void agregar(JTextField textFieldNombre, JTextField textFieldNombreIngles, JTextField textFieldConductores,
			JSpinner spinnerCaracteristicas, JTable table, JSpinner spinnerLiquidos, JSpinner spinnerObstaculos,
			JSpinner spinnerBombas, JButton btnAgregar) {

		String nombre = textFieldNombre.getText();
		String nombreIngles = textFieldNombreIngles.getText();
		String conductores = textFieldConductores.getText();
		int JSpinnerCaracteristicasValue = (int) spinnerCaracteristicas.getValue() - 1;
		String tamanoCaucho = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 2);
		String tipoCaucho = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 3);
		int velocidad = (int) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 4);
		String velocidadString = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 1);
		int resistenciaLiquidos = (int) spinnerLiquidos.getValue();
		int resistenciaBombas = (int) spinnerBombas.getValue();
		int resistenciaObstaculos = (int) spinnerObstaculos.getValue();

		String ruta;
		if (filePath == null) {
			ruta = "src\\resources\\defaultIcon.png";
		} else {
			ruta = filePath;
		}

		Vehiculos vehiculo = new Vehiculos(ruta, nombre, nombreIngles, conductores, tamanoCaucho, tipoCaucho, velocidad,
				velocidadString, resistenciaObstaculos, resistenciaLiquidos, resistenciaBombas);
		lista.agregarALista(vehiculo);

		mostrarVehiculoOptionPane(vehiculo);

		textFieldNombre.setText("");
		textFieldNombreIngles.setText("");
		textFieldConductores.setText("");
		btnAgregar.setEnabled(false);

	}

}
