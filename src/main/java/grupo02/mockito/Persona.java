package grupo02.mockito;

public class Persona {

	
	
	private String nombre;
	private int edad;
	private int salario;
	
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
		System.out.println("Ha entrado en getEdad en Persona");
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getSalario() {
		System.out.println("Ha entrado en getSalario en Persona");

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
