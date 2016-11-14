package grupo02.mockito;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Persona {

	
	
	private String nombre;
	private int edad;
	private int salario;
	
	final Logger logger = LogManager.getLogger(Persona.class);
	
	public Persona(String nombre, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		
		
		
		return nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
				
		logger.debug("Ha entrado en getEdad() de la clase PERSONA");
		
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getSalario() {
		
		logger.debug("Ha entrado en getSalario() de la clase PERSONA");
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", salario="
				+ salario + "]";
	}
	

	
}
