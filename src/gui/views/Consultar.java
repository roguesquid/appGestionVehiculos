package gui.views;

import javax.swing.JPanel;

import logica.ListaVehiculos;
import logica.Vehiculos;
import logica.main;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Consultar extends JPanel {
	ListaVehiculos lista = main.lista;
	/**
	 * Create the panel.
	 */
	public Consultar() {
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(0, 0, 1595, 972);
		add(background);
		background.setLayout(null);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBackground(new Color(7, 10, 19));
		headingSeparator.setBounds(64, 164, 133, 4);
		background.add(headingSeparator);
		
		JLabel lblConsultarVehiculo = new JLabel("Consultar Vehiculo");
		lblConsultarVehiculo.setFont(new Font("Public Sans", Font.BOLD, 48));
		lblConsultarVehiculo.setBounds(64, 96, 440, 56);
		background.add(lblConsultarVehiculo);
		
		JLabel lblSeleccioneElVehiculo = new JLabel("Seleccione el Vehiculo a consultar");
		lblSeleccioneElVehiculo.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		lblSeleccioneElVehiculo.setBounds(64, 228, 317, 16);
		background.add(lblSeleccioneElVehiculo);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(64, 260, 384, 24);
		background.add(comboBox);
		llenarComboBox(comboBox);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(64, 316, 200, 40);
		background.add(btnConsultar);
		
		JLabel lblInformacionDelVehiculo = new JLabel("Informacion del Vehiculo");
		lblInformacionDelVehiculo.setFont(new Font("Public Sans", Font.BOLD, 32));
		lblInformacionDelVehiculo.setBounds(64, 400, 384, 38);
		background.add(lblInformacionDelVehiculo);
		
		JPanel separadorSubtitulo = new JPanel();
		separadorSubtitulo.setBackground(new Color(7, 10, 19));
		separadorSubtitulo.setBounds(64, 446, 133, 2);
		background.add(separadorSubtitulo);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel.setBounds(64, 491, 68, 18);
		background.add(lblNewLabel);
		
		JLabel lblNombreEnIngls = new JLabel("Nombre en Inglés:");
		lblNombreEnIngls.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreEnIngls.setBounds(64, 520, 136, 18);
		background.add(lblNombreEnIngls);
		
		JLabel lblNombreConductores = new JLabel("Nombre Conductores:");
		lblNombreConductores.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreConductores.setBounds(64, 549, 170, 18);
		background.add(lblNombreConductores);
		
		JLabel lblTamaoDelCaucho = new JLabel("Tamaño del Caucho:");
		lblTamaoDelCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTamaoDelCaucho.setBounds(64, 578, 159, 18);
		background.add(lblTamaoDelCaucho);
		
		JLabel lblTipoDeCaucho = new JLabel("Tipo de Caucho:");
		lblTipoDeCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTipoDeCaucho.setBounds(64, 607, 133, 18);
		background.add(lblTipoDeCaucho);
		
		JLabel lblVelocidadkmh = new JLabel("Velocidad (Km/h):");
		lblVelocidadkmh.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadkmh.setBounds(64, 636, 136, 18);
		background.add(lblVelocidadkmh);
		
		JLabel lblVelocidad = new JLabel("Velocidad:");
		lblVelocidad.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidad.setBounds(64, 665, 88, 18);
		background.add(lblVelocidad);
		
		JLabel lblResistenciaAObstculos = new JLabel("Resistencia a Obstáculos:");
		lblResistenciaAObstculos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblResistenciaAObstculos.setBounds(64, 694, 200, 18);
		background.add(lblResistenciaAObstculos);
		
		JLabel lblNewLabel_7_1 = new JLabel("Resistencia a Líquidos:");
		lblNewLabel_7_1.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel_7_1.setBounds(64, 723, 180, 18);
		background.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Resistencia a Explosivos:");
		lblNewLabel_7_2.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNewLabel_7_2.setBounds(64, 752, 200, 18);
		background.add(lblNewLabel_7_2);
		
		JLabel lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombre.setBounds(142, 491, 420, 18);
		background.add(lblNombre);
		
		JLabel lblNombreIngles = new JLabel("");
		lblNombreIngles.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblNombreIngles.setBounds(210, 520, 420, 18);
		background.add(lblNombreIngles);
		
		JLabel lblConductores = new JLabel("");
		lblConductores.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblConductores.setBounds(239, 549, 420, 18);
		background.add(lblConductores);
		
		JLabel lblTamanoCaucho = new JLabel("");
		lblTamanoCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTamanoCaucho.setBounds(233, 578, 420, 18);
		background.add(lblTamanoCaucho);
		
		JLabel lblTipoCaucho = new JLabel("");
		lblTipoCaucho.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblTipoCaucho.setBounds(196, 607, 420, 18);
		background.add(lblTipoCaucho);
		
		JLabel lblVelocidadNumero = new JLabel("");
		lblVelocidadNumero.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadNumero.setBounds(210, 636, 420, 18);
		background.add(lblVelocidadNumero);
		
		JLabel lblVelocidadString = new JLabel("");
		lblVelocidadString.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblVelocidadString.setBounds(155, 665, 420, 18);
		background.add(lblVelocidadString);
		
		JLabel lblRObstaculos = new JLabel("");
		lblRObstaculos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRObstaculos.setBounds(268, 694, 68, 18);
		background.add(lblRObstaculos);
		
		JLabel lblRLiquidos = new JLabel("");
		lblRLiquidos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRLiquidos.setBounds(239, 723, 68, 18);
		background.add(lblRLiquidos);
		
		JLabel lblRExplosivos = new JLabel("");
		lblRExplosivos.setFont(new Font("Public Sans", Font.PLAIN, 16));
		lblRExplosivos.setBounds(268, 752, 68, 18);
		background.add(lblRExplosivos);
		
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostrarInfo(comboBox, lblNombre, lblNombreIngles, lblConductores, lblTamanoCaucho, lblTipoCaucho, lblVelocidadNumero, lblVelocidadString, lblRObstaculos, lblRLiquidos, lblRExplosivos);
			}
		});

	}
	
	private void mostrarInfo(JComboBox<String> comboBox, JLabel lblNombre, JLabel lblNombreIngles, JLabel lblConductores, JLabel lblTamanoCaucho, JLabel lblTipoCaucho, JLabel lblVelocidadNumero, JLabel lblVelocidadString, JLabel lblRObstaculos, JLabel lblRLiquidos, JLabel lblRExplosivos) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAConsultar = lista.buscarPorNombre(elementoSeleccionado);
		lblNombre.setText(carroAConsultar.getNombre());
		lblNombreIngles.setText(carroAConsultar.getNombreIngles());
		lblConductores.setText(carroAConsultar.getNombreConductores());
		lblTamanoCaucho.setText(carroAConsultar.getTamanoCaucho());
		lblTipoCaucho.setText(carroAConsultar.getTipoDeCaucho());
		lblVelocidadNumero.setText(Integer.toString(carroAConsultar.getVelocidad())+"Km/h");
		lblVelocidadString.setText(carroAConsultar.getVelocidadString());
		lblRObstaculos.setText(Integer.toString(carroAConsultar.getResistenciaObstaculos()));
		lblRLiquidos.setText(Integer.toString(carroAConsultar.getResistenciaLiquido()));
		lblRExplosivos.setText(Integer.toString(carroAConsultar.getResistenciaExplosivos()));
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

}
