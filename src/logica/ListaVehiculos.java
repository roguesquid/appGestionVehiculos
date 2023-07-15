package logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * La clase ListaVehiculos representa una lista enlazada de vehículos.
 */
public class ListaVehiculos {
	
	private Vehiculos primero;
	
	/**
	 * Crea una instancia de ListaVehiculos.
	 * La lista se inicializa vacía.
	 */
	public ListaVehiculos() {
		this.primero = null;
	}
	
	public Vehiculos getPrimero() {
		return primero;
	}
	
	/**
	 * Verifica si la lista de vehículos está vacía.
	 * 
	 * @return true si la lista está vacía, false de lo contrario.
	 */
	public boolean esVacia() {
		return primero == null;
	}
	
	/**
	 * Crea un nuevo vehículo a partir de otro vehículo dado.
	 * 
	 * @param temp el vehículo del cual se copiarán los datos.
	 * @return el nuevo vehículo creado.
	 */
	public Vehiculos crearVehiculo(String nombre, String nombreIngles, String nombreConductores, int velocidad, int resistenciaObstaculos, int resistenciaLiquido, int resistenciaExplosivos) {
		Vehiculos carro = new Vehiculos();
		carro.setNombre(nombre);
		carro.setNombreIngles(nombreIngles);
		carro.setNombreConductores(nombreConductores);
		carro.setVelocidad(velocidad);
		carro.setResistenciaObstaculos(resistenciaObstaculos);
		carro.setResistenciaLiquido(resistenciaLiquido);
		carro.setResistenciaExplosivos(resistenciaExplosivos);
		carro.setProx(null);
		return carro;
	}
	
	/**
	 * Agrega un vehículo a la lista.
	 * 
	 * @param carro el vehículo a agregar.
	 */
	public void agregarALista(Vehiculos carro) {
		carro.setProx(this.primero);
		this.primero = carro;
	}
	
	/**
	 * Elimina un vehículo de la lista según su nombre.
	 * 
	 * @param nombre el nombre del vehículo a eliminar.
	 */
	public void eliminarDeLista(String nombre) {
		if (this.primero == null) {
			return;
		} else if (this.primero.getNombre().equals(nombre)) {
			this.primero = this.primero.getProx();
			return;
		} else {
			Vehiculos anterior = this.primero;
			Vehiculos actual = this.primero.getProx();
			while ((actual != null) && !actual.getNombre().equals(nombre)) {
				anterior = actual;
				actual = actual.getProx();
			}
			if (actual != null) {
				anterior.setProx(actual);
			}
		}
	}
	
	/**
	 * Muestra los vehículos en la lista.
	 */
	public void mostrarLista() {
		Vehiculos temp = primero;
		while (temp != null) {
			System.out.println(temp.getNombre() + "," + temp.getNombreIngles() + "," + temp.getNombreConductores() + "," + temp.getVelocidad() + "," + temp.getResistenciaObstaculos() + "," + temp.getResistenciaLiquido() + "," + temp.getResistenciaExplosivos());
			temp = temp.getProx();
		}
	}
	
	/**
	 * Busca un vehículo por su nombre y retorna ese vehículo.
	 * 
	 * @param nombre el nombre del vehículo a buscar.
	 * @return el vehículo encontrado, o null si no se encuentra.
	 */
	public Vehiculos buscarPorNombre(String nombre) {
	    Vehiculos temp = primero;
	    while (temp != null) {
	        if (temp.getNombre().equals(nombre)) {
	            return temp;
	        }
	        temp = temp.getProx();
	    }
	    return null;
	}
	
	/**
	 * Cuenta el número de vehículos en la lista.
	 * 
	 * @return el número de vehículos en la lista.
	 */
	public int contarNodos() {
		int contador = 0;
		Vehiculos actual = this.primero;
		while (actual != null) {
			contador++;
			actual = actual.getProx();
		}
		return contador;
	}
	
	/**
	 * Obtiene el vehículo en la posición especificada.
	 * 
	 * @param posicion la posición del vehículo a obtener (índice basado en 0).
	 * @return el vehículo en la posición dada, o null si la posición es inválida.
	 */
	public Vehiculos obtenerElemento(int posicion) {
		if (posicion < 0 || posicion >= contarNodos()) {
			return null;
		}
		Vehiculos actual = this.primero;
		for (int i = 0; i < posicion; i++) {
			actual = actual.getProx();
		}
		return actual;
	}
	
	/**
	 * Verifica si un string está vacío.
	 * 
	 * @param nombre el string a verificar.
	 * @return true si el string está vacío, false de lo contrario.
	 */
	public boolean strignVacio(String nombre) {
		return (nombre.length() == 0);
	}
	
	/**
	 * Verifica si un nombre de vehículo ya existe en la lista.
	 * 
	 * @param nombre el nombre a verificar.
	 * @return true si el nombre existe, false de lo contrario.
	 */
	public boolean existeNombre(String nombre) {
		Vehiculos temp = primero;
		while (temp != null) {
			if (temp.getNombre().equals(nombre)) {
				return true;
			}
			temp = temp.getProx();
		}
		return false;
	}
	
	/**
	 * Verifica si un nombre de vehículo es válido.
	 * 
	 * @param nombre el nombre a verificar.
	 * @return true si el nombre es válido, false de lo contrario.
	 */
	public boolean nombreValido(String nombre) {
		if (!strignVacio(nombre)) {
			if (nombre.length() < 20) {
				if (!existeNombre(nombre)) {
					return true;
				} else {
					System.out.println("El nombre del vehículo ya existe.");
					return false;
				}
			} else {
				System.out.println("El nombre del vehículo no puede tener más de 20 caracteres.");
				return false;
			}
		} else {
			System.out.println("El nombre del vehículo no puede estar vacío.");
			return false;
		}
	}
	
	/**
	 * Verifica si un nombre de conductor es válido.
	 * 
	 * @param nombre el nombre a verificar.
	 * @return true si el nombre es válido, false de lo contrario.
	 */
	public boolean nombreConductoresValido(String nombre) {
		if (!strignVacio(nombre)) {
			if (nombre.length() < 20) {
				return true;
			} else {
				System.out.println("El nombre del vehículo no puede tener más de 20 caracteres.");
				return false;
			}
		} else {
			System.out.println("El nombre del vehículo no puede estar vacío.");
			return false;
		}
	}
	
	/**
	 * Verifica si un nombre en inglés de vehículo es válido.
	 * 
	 * @param nombre el nombre a verificar.
	 * @return true si el nombre es válido, false de lo contrario.
	 */
	public boolean nombreInglesValido(String nombre) {
		if (!strignVacio(nombre)) {
			if (nombre.length() < 20) {
				return true;
			} else {
				System.out.println("El nombre del vehículo no puede tener más de 20 caracteres.");
				return false;
			}
		} else {
			System.out.println("El nombre del vehículo no puede estar vacío.");
			return false;
		}
	}
	
	/**
	 * Crea un nuevo archivo.
	 * 
	 * @param autos el nombre del archivo a crear.
	 */
	public void crearArchivo(String autos) {
		File file = new File(autos);
		try {
			if (file.createNewFile()) {
				System.out.println("Archivo creado: " + file.getName());
			} else {
				System.out.println("El archivo ya existe.");
			}
		} catch (IOException e) {
			System.out.println("Ocurrió un error al crear el archivo.");
			e.printStackTrace();
		}
	}
	
	/**
	 * Escribe en un archivo los datos de los vehículos en la lista.
	 * 
	 * @param autos el nombre del archivo en el cual escribir.
	 */
	public void escribirArchivo(String autos) {
		try {
			FileWriter escribir = new FileWriter(autos);
			Vehiculos temp = primero;
			while (temp != null) {
				escribir.write(temp.getNombre() + "," + temp.getNombreIngles() + "," + temp.getNombreConductores() + "," + temp.getVelocidad() + "," + temp.getResistenciaObstaculos() + "," + temp.getResistenciaLiquido() + "," + temp.getResistenciaExplosivos() + "\n");
				temp = temp.getProx();
			}
			escribir.close();
			System.out.println("Se escribió en el archivo.");
		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el archivo.");
			e.printStackTrace();
		}
	}
	
	/**
	 * Lee los datos de los vehículos desde un archivo y los agrega a la lista.
	 * 
	 * @param autos el nombre del archivo a leer.
	 */
	public void leerArchivo(String autos) {
		Scanner leer = null;
		try {
			String[] datos = new String[7];
			File lectura = new File(autos);
			leer = new Scanner(lectura);
			while (leer.hasNextLine()) {
				String data = leer.nextLine();
				datos = data.split(",");
				Vehiculos carro = crearVehiculo(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), Integer.parseInt(datos[6]));
				agregarALista(carro);
			}
		} catch (IOException e) {
			System.out.println("Ocurrió un error al leer el archivo.");
			e.printStackTrace();
		} finally {
			if (leer != null) {
				leer.close();
			}
		}
	}
}
