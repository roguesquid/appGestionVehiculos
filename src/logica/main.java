package logica;

import com.formdev.flatlaf.FlatLightLaf;
import gui.Dashboard;

public class main {
	public static ListaVehiculos lista = new ListaVehiculos();
	public static void main(String[] args) {
		FlatLightLaf.setup();
		
		Dashboard pantallaInicial = new Dashboard();
		pantallaInicial.setVisible(true);
	}
}
