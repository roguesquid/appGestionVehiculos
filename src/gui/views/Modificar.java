package gui.views;

import javax.swing.JPanel;

import logica.ListaVehiculos;
import logica.Vehiculos;
import logica.main;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

public class Modificar extends JPanel {
	ListaVehiculos lista = main.lista;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private String filePath;

	/**
	 * Create the panel.
	 */
	public Modificar() {
		setLayout(null);

		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);

		JPanel panelResistencias = new JPanel();
		panelResistencias.setBackground(new Color(255, 255, 255));
		panelResistencias.setBounds(64, 473, 843, 352);
		background.add(panelResistencias);
		panelResistencias.setLayout(null);
		panelResistencias.setVisible(false);

		JLabel labelSubtitulo1_1_1 = new JLabel("Resistencias");
		labelSubtitulo1_1_1.setFont(new Font("Public Sans", Font.BOLD, 32));
		labelSubtitulo1_1_1.setBounds(0, 0, 243, 38);
		panelResistencias.add(labelSubtitulo1_1_1);

		JPanel separadorSubtitulo_1_1_1 = new JPanel();
		separadorSubtitulo_1_1_1.setBackground(new Color(7, 10, 19));
		separadorSubtitulo_1_1_1.setBounds(0, 46, 133, 2);
		panelResistencias.add(separadorSubtitulo_1_1_1);

		JLabel lblLiquidos = new JLabel("Liquidos (10-35)");
		lblLiquidos.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblLiquidos.setBounds(0, 86, 148, 16);
		panelResistencias.add(lblLiquidos);

		JLabel lblObstaculos = new JLabel("Obstaculos (5-40)");
		lblObstaculos.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblObstaculos.setBounds(264, 86, 167, 19);
		panelResistencias.add(lblObstaculos);

		JLabel lblBombas = new JLabel("Bombas (5-35)");
		lblBombas.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblBombas.setBounds(0, 174, 148, 16);
		panelResistencias.add(lblBombas);

		JSpinner spinnerLiquidos = new JSpinner();
		spinnerLiquidos.setModel(new SpinnerNumberModel(10, 10, 35, 1));
		spinnerLiquidos.setBounds(0, 118, 148, 22);
		panelResistencias.add(spinnerLiquidos);

		JSpinner spinnerObstaculos = new JSpinner();
		spinnerObstaculos.setModel(new SpinnerNumberModel(5, 5, 40, 1));
		spinnerObstaculos.setBounds(264, 118, 148, 22);
		panelResistencias.add(spinnerObstaculos);

		JSpinner spinnerBombas = new JSpinner();
		spinnerBombas.setModel(new SpinnerNumberModel(5, 5, 35, 1));
		spinnerBombas.setBounds(0, 206, 148, 22);
		panelResistencias.add(spinnerBombas);

		JPanel panelCaracteristicas = new JPanel();
		panelCaracteristicas.setBackground(new Color(255, 255, 255));
		panelCaracteristicas.setBounds(64, 473, 818, 400);
		background.add(panelCaracteristicas);
		panelCaracteristicas.setLayout(null);
		panelCaracteristicas.setVisible(false);

		JPanel separadorSubtitulo_1_1 = new JPanel();
		separadorSubtitulo_1_1.setBackground(new Color(7, 10, 19));
		separadorSubtitulo_1_1.setBounds(0, 46, 133, 2);
		panelCaracteristicas.add(separadorSubtitulo_1_1);

		JLabel labelSubtitulo1_1 = new JLabel("Caracteristicas");
		labelSubtitulo1_1.setFont(new Font("Public Sans", Font.BOLD, 32));
		labelSubtitulo1_1.setBounds(0, 0, 243, 38);
		panelCaracteristicas.add(labelSubtitulo1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 86, 805, 233);
		panelCaracteristicas.add(scrollPane);

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

		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo");
		lblSeleccioneElTipo.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblSeleccioneElTipo.setBounds(0, 349, 167, 16);
		panelCaracteristicas.add(lblSeleccioneElTipo);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 9, 1));
		spinner.setBounds(189, 348, 58, 22);
		panelCaracteristicas.add(spinner);

		JLabel lblSeleccioneElVehiculo = new JLabel("Seleccione el Vehiculo a modificar");
		lblSeleccioneElVehiculo.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblSeleccioneElVehiculo.setBounds(64, 228, 330, 16);
		background.add(lblSeleccioneElVehiculo);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(64, 260, 384, 24);
		llenarComboBox(comboBox);
		background.add(comboBox);

		JLabel lblModificarVehiculo = new JLabel("Modificar Vehiculo");
		lblModificarVehiculo.setFont(new Font("Public Sans", Font.BOLD, 48));
		lblModificarVehiculo.setBounds(64, 96, 432, 56);
		background.add(lblModificarVehiculo);

		JPanel headingSeparator = new JPanel();
		headingSeparator.setBackground(new Color(7, 10, 19));
		headingSeparator.setBounds(64, 164, 133, 4);
		background.add(headingSeparator);

		JLabel lblQueAtributosDeseas_1 = new JLabel("Informacion del Vehiculo");
		lblQueAtributosDeseas_1.setFont(new Font("Public Sans", Font.BOLD, 32));
		lblQueAtributosDeseas_1.setBounds(950, 118, 384, 38);
		background.add(lblQueAtributosDeseas_1);

		JPanel separadorSubtitulo_1 = new JPanel();
		separadorSubtitulo_1.setBackground(new Color(7, 10, 19));
		separadorSubtitulo_1.setBounds(950, 164, 133, 2);
		background.add(separadorSubtitulo_1);

		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel.setBounds(950, 193, 68, 18);
		background.add(lblNewLabel);

		JLabel lblNombreEnIngls = new JLabel("Nombre en Inglés:");
		lblNombreEnIngls.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreEnIngls.setBounds(950, 222, 136, 18);
		background.add(lblNombreEnIngls);

		JLabel lblNombreConductores = new JLabel("Nombre Conductores:");
		lblNombreConductores.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreConductores.setBounds(950, 251, 170, 18);
		background.add(lblNombreConductores);

		JLabel lblTamaoDelCaucho = new JLabel("Tamaño del Caucho:");
		lblTamaoDelCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTamaoDelCaucho.setBounds(950, 280, 159, 18);
		background.add(lblTamaoDelCaucho);

		JLabel lblTipoDeCaucho = new JLabel("Tipo de Caucho:");
		lblTipoDeCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTipoDeCaucho.setBounds(950, 309, 133, 18);
		background.add(lblTipoDeCaucho);

		JLabel lblVelocidadkmh = new JLabel("Velocidad (Km/h):");
		lblVelocidadkmh.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadkmh.setBounds(950, 338, 136, 18);
		background.add(lblVelocidadkmh);

		JLabel lblVelocidad = new JLabel("Velocidad:");
		lblVelocidad.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidad.setBounds(950, 367, 88, 18);
		background.add(lblVelocidad);

		JLabel lblResistenciaAObstculos = new JLabel("Resistencia a Obstáculos:");
		lblResistenciaAObstculos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblResistenciaAObstculos.setBounds(950, 396, 200, 18);
		background.add(lblResistenciaAObstculos);

		JLabel lblNewLabel_7_1 = new JLabel("Resistencia a Líquidos:");
		lblNewLabel_7_1.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(950, 425, 180, 18);
		background.add(lblNewLabel_7_1);

		JLabel lblNewLabel_7_2 = new JLabel("Resistencia a Explosivos:");
		lblNewLabel_7_2.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel_7_2.setBounds(950, 454, 200, 18);
		background.add(lblNewLabel_7_2);

		JLabel lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombre.setBounds(1028, 193, 420, 18);
		background.add(lblNombre);

		JLabel lblNombreIngles = new JLabel("");
		lblNombreIngles.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreIngles.setBounds(1096, 222, 420, 18);
		background.add(lblNombreIngles);

		JLabel lblConductores = new JLabel("");
		lblConductores.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblConductores.setBounds(1125, 251, 420, 18);
		background.add(lblConductores);

		JLabel lblTamanoCaucho = new JLabel("");
		lblTamanoCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTamanoCaucho.setBounds(1119, 280, 420, 18);
		background.add(lblTamanoCaucho);

		JLabel lblTipoCaucho = new JLabel("");
		lblTipoCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTipoCaucho.setBounds(1082, 309, 420, 18);
		background.add(lblTipoCaucho);

		JLabel lblVelocidadNumero = new JLabel("");
		lblVelocidadNumero.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadNumero.setBounds(1096, 338, 420, 18);
		background.add(lblVelocidadNumero);

		JLabel lblVelocidadString = new JLabel("");
		lblVelocidadString.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadString.setBounds(1041, 367, 420, 18);
		background.add(lblVelocidadString);

		JLabel lblRObstaculos = new JLabel("");
		lblRObstaculos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRObstaculos.setBounds(1154, 396, 68, 18);
		background.add(lblRObstaculos);

		JLabel lblRLiquidos = new JLabel("");
		lblRLiquidos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRLiquidos.setBounds(1125, 425, 68, 18);
		background.add(lblRLiquidos);

		JLabel lblRExplosivos = new JLabel("");
		lblRExplosivos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRExplosivos.setBounds(1154, 454, 68, 18);
		background.add(lblRExplosivos);

		JPanel panelAtributos = new JPanel();
		panelAtributos.setBackground(new Color(255, 255, 255));
		panelAtributos.setBounds(64, 338, 503, 90);
		background.add(panelAtributos);
		panelAtributos.setLayout(null);

		JLabel lblQueAtributosDeseas = new JLabel("Que atributos deseas modificar?");
		lblQueAtributosDeseas.setFont(new Font("Public Sans", Font.BOLD, 32));
		lblQueAtributosDeseas.setBounds(0, 0, 522, 38);
		panelAtributos.add(lblQueAtributosDeseas);

		JPanel separadorSubtitulo = new JPanel();
		separadorSubtitulo.setBackground(new Color(7, 10, 19));
		separadorSubtitulo.setBounds(0, 46, 133, 2);
		panelAtributos.add(separadorSubtitulo);

		String[] elementos = { "Datos Básicos (Nombre, Nombre en inglés, Conductores, icono)",
				"Cualidades (Tamaño caucho, Tipo de caucho, Velocidad)",
				"Resistencias (Resistencia a Obstáculos, Explosivos, Líquidos)" };
		JComboBox<String> comboBoxAtributos = new JComboBox<>(elementos);
		comboBoxAtributos.setBounds(0, 68, 384, 22);
		panelAtributos.add(comboBoxAtributos);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(414, 67, 89, 23);
		panelAtributos.add(btnNewButton);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelAtributos.setVisible(true); // Mostrar el panel de atributos al hacer clic en "Buscar"
				mostrarInfo(comboBox, lblNombre, lblNombreIngles, lblConductores, lblTamanoCaucho, lblTipoCaucho,
						lblVelocidadNumero, lblVelocidadString, lblRObstaculos, lblRLiquidos, lblRExplosivos);
			}
		});
		// En el constructor de la clase:
		panelAtributos.setVisible(false); // Ocultar el panel de atributos inicialmente
		btnBuscar.setBounds(480, 261, 89, 23);
		background.add(btnBuscar);

		JPanel panelDatosBasicos = new JPanel();
		panelDatosBasicos.setBackground(new Color(255, 255, 255));
		panelDatosBasicos.setBounds(64, 473, 843, 259);
		background.add(panelDatosBasicos);
		panelDatosBasicos.setLayout(null);
		panelDatosBasicos.setVisible(false);

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		labelNombre.setBounds(0, 86, 74, 16);
		panelDatosBasicos.add(labelNombre);

		textField = new JTextField();
		textField.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(0, 118, 232, 24);
		panelDatosBasicos.add(textField);

		JLabel labelNombreIngles = new JLabel("Nombre en ingles");
		labelNombreIngles.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		labelNombreIngles.setBounds(280, 86, 167, 19);
		panelDatosBasicos.add(labelNombreIngles);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(280, 118, 232, 24);
		panelDatosBasicos.add(textField_1);

		JLabel labelConductores = new JLabel("Conductores");
		labelConductores.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		labelConductores.setBounds(560, 86, 119, 16);
		panelDatosBasicos.add(labelConductores);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(560, 118, 232, 24);
		panelDatosBasicos.add(textField_2);

		JLabel labelSubtitulo1 = new JLabel("Datos Basicos");
		labelSubtitulo1.setFont(new Font("Public Sans", Font.BOLD, 32));
		labelSubtitulo1.setBounds(0, 0, 225, 38);
		panelDatosBasicos.add(labelSubtitulo1);

		JPanel separadorSubtitulo_2 = new JPanel();
		separadorSubtitulo_2.setBackground(new Color(7, 10, 19));
		separadorSubtitulo_2.setBounds(0, 46, 133, 2);
		panelDatosBasicos.add(separadorSubtitulo_2);

		JLabel lblBrowse = new JLabel("Seleccione el icono del Vehiculo:");
		lblBrowse.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblBrowse.setBounds(0, 179, 306, 16);
		panelDatosBasicos.add(lblBrowse);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(314, 176, 89, 23);
		panelDatosBasicos.add(btnBrowse);
		btnBrowse.addActionListener(e -> {
			JFileChooser fileChooser = new JFileChooser();
			int result = fileChooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
				// Seleccionar archivo
				java.io.File selectedFile = fileChooser.getSelectedFile();
				filePath = selectedFile.getAbsolutePath();
			}
		});

		JButton btnNewButton_1 = new JButton("Guardar Cambios");
		btnNewButton_1.setBounds(950, 511, 128, 32);
		background.add(btnNewButton_1);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectedItem = (String) comboBoxAtributos.getSelectedItem();
				if (selectedItem.equals("Datos Básicos (Nombre, Nombre en inglés, Conductores, icono)")) {
					panelCaracteristicas.setVisible(false);
					panelResistencias.setVisible(false);
					panelDatosBasicos.setVisible(true);
					llenarTextBoxDatosBasicos(comboBox, textField, textField_1, textField_2);
				} else if (selectedItem.equals("Cualidades (Tamaño caucho, Tipo de caucho, Velocidad)")) {
					panelDatosBasicos.setVisible(false);
					panelResistencias.setVisible(false);
					panelCaracteristicas.setVisible(true);
				} else if (selectedItem.equals("Resistencias (Resistencia a Obstáculos, Explosivos, Líquidos)")) {
					panelDatosBasicos.setVisible(false);
					panelCaracteristicas.setVisible(false);
					panelResistencias.setVisible(true);
				}
			}
		});

		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectedItem = (String) comboBoxAtributos.getSelectedItem();
				if (selectedItem.equals("Datos Básicos (Nombre, Nombre en inglés, Conductores, icono)")) {
					modificarDatosBasicos(comboBox, textField, textField_1, textField_2);
					mostrarInfo(comboBox, lblNombre, lblNombreIngles, lblConductores, lblTamanoCaucho, lblTipoCaucho,
							lblVelocidadNumero, lblVelocidadString, lblRObstaculos, lblRLiquidos, lblRExplosivos);
					panelDatosBasicos.setVisible(false);
				} else if (selectedItem.equals("Cualidades (Tamaño caucho, Tipo de caucho, Velocidad)")) {
					modificarCaracteristicas(comboBox, spinner, table);
					panelCaracteristicas.setVisible(false);
					mostrarInfo(comboBox, lblNombre, lblNombreIngles, lblConductores, lblTamanoCaucho, lblTipoCaucho,
							lblVelocidadNumero, lblVelocidadString, lblRObstaculos, lblRLiquidos, lblRExplosivos);
				} else if (selectedItem.equals("Resistencias (Resistencia a Obstáculos, Explosivos, Líquidos)")) {
					modificarResistencias(comboBox, spinnerLiquidos, spinnerObstaculos, spinnerBombas);
					panelResistencias.setVisible(false);
					mostrarInfo(comboBox, lblNombre, lblNombreIngles, lblConductores, lblTamanoCaucho, lblTipoCaucho,
							lblVelocidadNumero, lblVelocidadString, lblRObstaculos, lblRLiquidos, lblRExplosivos);
				}
			}
		});

	}

	public void mostrarVehiculoOptionPane(Vehiculos vehiculo) {
		String mensaje = "Vehiculo Modificado satisfactoriamente " +
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

	private void llenarTextBoxDatosBasicos(JComboBox<String> comboBox, JTextField textFieldNombre,
			JTextField textFieldNombreIngles, JTextField textFieldNombreConductores) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);
		textFieldNombre.setText(carroAConsultar.getNombre());
		textFieldNombreIngles.setText(carroAConsultar.getNombreIngles());
		textFieldNombreConductores.setText(carroAConsultar.getNombreConductores());
	}

	private void modificarDatosBasicos(JComboBox<String> comboBox, JTextField textFieldNombre,
			JTextField textFieldNombreIngles,
			JTextField textFieldNombreConductores) {
		String nuevoNombre = textFieldNombre.getText();
		String nuevoNombreIngles = textFieldNombreIngles.getText();
		String nuevoNombreConductores = textFieldNombreConductores.getText();

		if (lista.nombreValido(nuevoNombre) && lista.nombreValido(nuevoNombreIngles)
				&& lista.nombreValido(nuevoNombreConductores)) {
			String elementoSeleccionado = (String) comboBox.getSelectedItem();
			Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);
			carroAConsultar.setNombre(nuevoNombre);
			carroAConsultar.setNombreIngles(nuevoNombreIngles);
			carroAConsultar.setNombreConductores(nuevoNombreConductores);
			if (filePath != null) {
				carroAConsultar.setRutaIcono(filePath);
			}
			mostrarVehiculoOptionPane(carroAConsultar);
			llenarComboBox(comboBox);
			llenarTextBoxDatosBasicos(comboBox, textFieldNombre, textFieldNombreIngles, textFieldNombreConductores);
		} else if (lista.strignVacio(nuevoNombre)) {
			JOptionPane.showMessageDialog(null, "No se pudo modificar, no se puede tener un vehiculo sin nombre", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (lista.existeNombre(nuevoNombreConductores)) {
			JOptionPane.showMessageDialog(null, "No se pudo modificar, ya hay un vehículo con el mismo nombre", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (!lista.nombreInglesValido(nuevoNombreIngles)) {
			JOptionPane.showMessageDialog(null, "No se pudo modificar, no tiene nombre en ingles", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (!lista.nombreConductoresValido(nuevoNombreConductores)) {
			JOptionPane.showMessageDialog(null, "No se pudo modificar, no tiene nombre de conductores", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void modificarCaracteristicas(JComboBox<String> comboBox, JSpinner spinnerCaracteristicas, JTable table) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);

		int JSpinnerCaracteristicasValue = (int) spinnerCaracteristicas.getValue() - 1;
		String tamanoCaucho = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 2);
		String tipoCaucho = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 3);
		int velocidad = (int) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 4);
		String velocidadString = (String) table.getModel().getValueAt(JSpinnerCaracteristicasValue, 1);

		carroAConsultar.setTamanoCaucho(tamanoCaucho);
		carroAConsultar.setTipoDeCaucho(tipoCaucho);
		carroAConsultar.setVelocidad(velocidad);
		carroAConsultar.setVelocidadString(velocidadString);

		mostrarVehiculoOptionPane(carroAConsultar);
		llenarComboBox(comboBox);

	}

	private void modificarResistencias(JComboBox<String> comboBox, JSpinner spinnerLiquidos, JSpinner spinnerObstaculos,
			JSpinner spinnerBombas) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);

		int resistenciaLiquidos = (int) spinnerLiquidos.getValue();
		int resistenciaObstaculos = (int) spinnerObstaculos.getValue();
		int resistenciaExplosivos = (int) spinnerBombas.getValue();

		carroAConsultar.setResistenciaLiquido(resistenciaLiquidos);
		carroAConsultar.setResistenciaObstaculos(resistenciaObstaculos);
		carroAConsultar.setResistenciaExplosivos(resistenciaExplosivos);

		mostrarVehiculoOptionPane(carroAConsultar);
		llenarComboBox(comboBox);
	}

	private void llenarComboBox(JComboBox<String> comboBox) {
		// Obtener el modelo del JComboBox
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

		// Recorrer la lista y agregar los elementos al modelo del JComboBox
		Vehiculos actual = main.lista.getPrimero();
		while (actual != null) {
			String elemento = (String) actual.getNombre();
			model.addElement(elemento);
			actual = actual.getProx();
		}

		// Establecer el modelo actualizado en el JComboBox
		comboBox.setModel(model);
	}

	private void mostrarInfo(JComboBox<String> comboBox, JLabel lblNombre, JLabel lblNombreIngles, JLabel lblConductores,
			JLabel lblTamanoCaucho, JLabel lblTipoCaucho, JLabel lblVelocidadNumero, JLabel lblVelocidadString,
			JLabel lblRObstaculos, JLabel lblRLiquidos, JLabel lblRExplosivos) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);
		lblNombre.setText(carroAConsultar.getNombre());
		lblNombreIngles.setText(carroAConsultar.getNombreIngles());
		lblConductores.setText(carroAConsultar.getNombreConductores());
		lblTamanoCaucho.setText(carroAConsultar.getTamanoCaucho());
		lblTipoCaucho.setText(carroAConsultar.getTipoDeCaucho());
		lblVelocidadNumero.setText(Integer.toString(carroAConsultar.getVelocidad()) + "Km/h");
		lblVelocidadString.setText(carroAConsultar.getVelocidadString());
		lblRObstaculos.setText(Integer.toString(carroAConsultar.getResistenciaObstaculos()));
		lblRLiquidos.setText(Integer.toString(carroAConsultar.getResistenciaLiquido()));
		lblRExplosivos.setText(Integer.toString(carroAConsultar.getResistenciaExplosivos()));
	}
}
