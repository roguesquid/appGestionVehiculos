package gui.views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import logica.ListaVehiculos;
import logica.Vehiculos;
import logica.main;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Eliminar extends JPanel {
	ListaVehiculos lista = main.lista;
	/**
	 * Create the panel.
	 */
	public Eliminar() {
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setLayout(null);
		background.setBackground(Color.WHITE);
		background.setBounds(0, 0, 1595, 972);
		add(background);
		
		JLabel heading = new JLabel("Eliminar Vehiculo");
		heading.setFont(new Font("Public Sans", Font.BOLD, 48));
		heading.setBounds(64, 96, 403, 56);
		background.add(heading);
		
		JPanel headingSeparator = new JPanel();
		headingSeparator.setBackground(new Color(7, 10, 19));
		headingSeparator.setBounds(64, 164, 133, 4);
		background.add(headingSeparator);
		
		JLabel labelNombre = new JLabel("Seleccione el Vehiculo a eliminar");
		labelNombre.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		labelNombre.setBounds(64, 228, 303, 16);
		background.add(labelNombre);
		
		// Crear un JComboBox
        JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(64, 260, 384, 24);
		background.add(comboBox);
		llenarComboBox(comboBox);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				eliminar(comboBox);
			}
		});
		btnEliminar.setBounds(64, 311, 200, 40);
		background.add(btnEliminar);
		//btnEliminar.setBackground(Color.RED);
		//btnEliminar.setForeground(Color.WHITE);

	}
	
	public void mostrarVehiculoOptionPane(Vehiculos vehiculo) {
		String mensaje = "Vehiculo Eliminado satisfactoriamente" +
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
	
	private void eliminar(JComboBox<String> comboBox) {
		String elementoSeleccionado = (String) comboBox.getSelectedItem();
		Vehiculos carroAEliminar = lista.buscarPorNombre(elementoSeleccionado);
		lista.eliminarDeLista(elementoSeleccionado);
		mostrarVehiculoOptionPane(carroAEliminar);
		llenarComboBox(comboBox);
	}
	
	private void llenarComboBox(JComboBox<String> comboBox) {
		// Obtener el modelo del JComboBox
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        // Recorrer la lista y agregar los elementos al modelo del JComboBox
        Vehiculos actual = lista.getPrimero();
        while (actual != null) {
            String elemento = (String) actual.getNombre();
            model.addElement(elemento);
            actual = actual.getProx();
        }

        // Establecer el modelo actualizado en el JComboBox
        comboBox.setModel(model);
	}
}
