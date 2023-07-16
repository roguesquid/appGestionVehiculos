package logica;

public class Vehiculos {
	
	private String rutaIcono;
	private String nombre;
	private String nombreIngles;
	private String nombreConductores;
	private String tamanoCaucho;
	private String tipoDeCaucho;
	private int velocidad;
	private String velocidadString;
	private int resistenciaObstaculos;
	private int resistenciaLiquido;
	private int resistenciaExplosivos;
	private int kilometraje;
	private int tiempo;
	private Vehiculos prox;
	
	public Vehiculos() {
		
	}
	
	/**
	 * Crea una instancia de Vehiculos con los datos proporcionados.
	 * 
	 * @param nombre el nombre del vehículo.
	 * @param nombreIngles el nombre en inglés del vehículo.
	 * @param nombreConductores el nombre del conductor del vehículo.
	 * @param tamanoCaucho el tamaño del caucho del vehículo.
	 * @param tipoCaucho el tipo de caucho del vehículo.
	 * @param velocidad la velocidad del vehículo.
	 * @param velocidadString la velocidad en formato de cadena del vehículo.
	 * @param resistenciaObstaculos la resistencia a obstáculos del vehículo.
	 * @param resistenciaLiquido la resistencia a líquidos del vehículo.
	 * @param resistenciaExplosivos la resistencia a explosivos del vehículo.
	 */
	public Vehiculos(String rutaIcono, String nombre, String nombreIngles, String nombreConductores, String tamanoCaucho, String tipoCaucho, int velocidad, String velocidadString, int resistenciaObstaculos, int resistenciaLiquido, int resistenciaExplosivos) {
		this.rutaIcono = rutaIcono;
		this.nombre = nombre;
		this.nombreIngles = nombreIngles;
		this.nombreConductores = nombreConductores;
		this.tamanoCaucho = tamanoCaucho;
		this.tipoDeCaucho = tipoCaucho;
		this.velocidad = velocidad;
		this.velocidadString = velocidadString;
		this.resistenciaObstaculos = resistenciaObstaculos;
		this.resistenciaLiquido = resistenciaLiquido;
		this.resistenciaExplosivos = resistenciaExplosivos;
	}
	
	//-------------------------------------------------------------------------------------------
	
	//setter de nombreEspanol
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//getter de nombreEspanol
	public String getNombre() {		
		return nombre;
	}
	
	//-------------------------------------------------------------------------------------------
	
	//setter de nombreIngles
	public void setNombreIngles(String nombre) {
		this.nombreIngles = nombre;
	}
	//getter de nombreIngles
	public String getNombreIngles() {		
		return nombreIngles;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setNombreConductores(String nombre) {
		this.nombreConductores = nombre;
	}
	
	public String getNombreConductores() {		
		return nombreConductores;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setTipoDeCaucho(String nombre) {
		this.tipoDeCaucho = nombre;
	}
	
	public String getTipoDeCaucho() {		
		return tipoDeCaucho;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setVelocidad(int numero) {
		this.velocidad = numero;
	}
		
	public int getVelocidad() {		
		return velocidad;
	}
		
	//-------------------------------------------------------------------------------------------
		
	public void setResistenciaObstaculos(int numero) {
		this.resistenciaObstaculos = numero;
	}
			
	public int getResistenciaObstaculos() {		
		return resistenciaObstaculos;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setResistenciaLiquido(int numero) {
		this.resistenciaLiquido = numero;
	}
			
	public int getResistenciaLiquido() {		
		return resistenciaLiquido;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setResistenciaExplosivos(int numero) {
		this.resistenciaExplosivos = numero;
	}
			
	public int getResistenciaExplosivos() {		
		return resistenciaExplosivos;
	} 
	
	//-------------------------------------------------------------------------------------------
	
	public void setProx(Vehiculos siguiente) {
		this.prox = siguiente;
	}
			
	public Vehiculos getProx() {		
		return prox;
	}
	//-------------------------------------------------------------------------------------------
	public String getTamanoCaucho() {
		return tamanoCaucho;
	}

	public void setTamanoCaucho(String tamanoCaucho) {
		this.tamanoCaucho = tamanoCaucho;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public void setKilometraje(int numero) {
		this.kilometraje = numero;
	}
				
	public int getKilometraje() {		
		return kilometraje;
		
	} 

	//-------------------------------------------------------------------------------------------

	public void setTiempo(int numero) {
		this.tiempo = numero;
	}

	public int getTiempo() {
		return tiempo;
	}

	public String getVelocidadString() {
		return velocidadString;
	}

	public void setVelocidadString(String velocidadString) {
		this.velocidadString = velocidadString;
	}

	public String getRutaIcono() {
		return rutaIcono;
	}

	public void setRutaIcono(String rutaIcono) {
		this.rutaIcono = rutaIcono;
	}
}
