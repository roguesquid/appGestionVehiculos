package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.views.Agregar;
import gui.views.Consultar;
import gui.views.Eliminar;
import gui.views.Listar;
import gui.views.Principal;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		this.setTitle("Aplicacion de Gestion de Vehiculos");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1060);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(7, 10, 19));
		footer.setBounds(0, 971, 1920, 40);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel footerCreditsLabel = new JLabel("© Luis Martin - Levin Jiménez - Wuinder Colmenares");
		footerCreditsLabel.setBounds(726, 8, 480, 24);
		footerCreditsLabel.setFont(new Font("Public Sans Light", Font.PLAIN, 20));
		footerCreditsLabel.setForeground(new Color(255, 255, 255));
		footer.add(footerCreditsLabel);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(30, 41, 59));
		menu.setBounds(0, 0, 325, 972);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel logoMenu = new JLabel("");
		logoMenu.setBounds(18, 32, 289, 71);
		logoMenu.setIcon(new ImageIcon("./src/resources/logMenu.png"));
		menu.add(logoMenu);
		
		JButton botonInicio = new JButton("Inicio");
		botonInicio.setIcon(new ImageIcon("./src/resources/homeIcon.png"));
		botonInicio.setBounds(0, 199, 325, 54);
		botonesMenu(botonInicio);
		menu.add(botonInicio);
		
		JButton botonAgregar = new JButton("Agregar");
		botonAgregar.setIcon(new ImageIcon("./src/resources/agregarIcon.png"));
		botonAgregar.setBounds(0, 253, 325, 54);
		botonesMenu(botonAgregar);
		menu.add(botonAgregar);
		
		JButton botonModificar = new JButton("Modificar");
		botonModificar.setIcon(new ImageIcon("./src/resources/modificarIcon.png"));
		botonModificar.setBounds(0, 307, 325, 54);
		botonesMenu(botonModificar);
		menu.add(botonModificar);
		
		JButton botonEliminar = new JButton("Eliminar");
		botonEliminar.setIcon(new ImageIcon("./src/resources/eliminarIcon.png"));
		botonEliminar.setBounds(0, 361, 325, 54);
		botonesMenu(botonEliminar);
		menu.add(botonEliminar);
		
		JButton botonConsultar = new JButton("Consultar");
		botonConsultar.setIcon(new ImageIcon("./src/resources/ConsultarIcon.png"));
		botonConsultar.setBounds(0, 415, 325, 54);
		botonesMenu(botonConsultar);
		menu.add(botonConsultar);
		
		JButton botonListar = new JButton("Listar");
		botonListar.setIcon(new ImageIcon("./src/resources/ListarIcon.png"));
		botonListar.setBounds(0, 469, 325, 54);
		botonesMenu(botonListar);
		menu.add(botonListar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon("./src/resources/salirIcon.png"));
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//GUARDAR VEHICULOS
				System.exit(0);
			}
		});
		btnSalir.setBounds(0, 918, 325, 54);
		botonesMenu(btnSalir);
		menu.add(btnSalir);
		
		JPanel content = new JPanel();
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(325, 0, 1595, 972);
		initContent(content);
		contentPane.add(content);
		
		botonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel(new Principal(), content);
			}
		});
		botonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel(new Agregar(), content);
			}
		});
		botonModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//showPanel(new Modificar(), content);
			}
		});
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel(new Eliminar(), content);
			}
		});
		botonConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				showPanel(new Consultar(), content);
			}
		});
		botonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPanel(new Listar(), content);
			}
		});
	}
	
    /**
     * Inicializa el contenido principal del dashboard.
     *
     * @param content El panel donde se mostrará el contenido principal.
     */
    private void initContent(JPanel content) {
        Principal p1 = new Principal();
        p1.setSize(1595, 972);
        p1.setLocation(0, 0);
        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    /**
     * Abre el panel seleccionado.
     *
     * @param panel El panel que se mostrara.
     * @param content El panel donde se mostrará el contenido principal.
     */
    private void showPanel(JPanel p, JPanel content) {

        p.setSize(1595, 972);
        p.setLocation(0, 0);
        content.setLayout(new BorderLayout());
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * Configura los estilos y eventos para los botones del menú.
     *
     * @param button El botón al que se aplicarán los estilos y eventos.
     */
    private void botonesMenu(JButton button) {
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setIconTextGap(24);
        button.setBorder(new EmptyBorder(0, 16, 0, 0));
        button.setBorderPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setBackground(new Color(51, 65, 85)); // Color de fondo del botón
        button.setFont(new Font("Public Sans Regular", Font.PLAIN, 24));
        button.setForeground(Color.WHITE);
        mouseEventsMenuButtons(button);
    }

    /**
     * Agrega eventos de mouse a los botones del menú.
     *
     * @param button El botón al que se agregarán los eventos de mouse.
     */
    private void mouseEventsMenuButtons(JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(71, 85, 105)); // Color de fondo cuando el cursor está sobre el botón
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(51, 65, 85)); // Color de fondo normal del botón
            }
        });
    }
}
