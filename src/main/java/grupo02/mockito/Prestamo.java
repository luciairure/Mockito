package grupo02.mockito;


public class Prestamo {
	
	

	private Persona cliente;
	private int interes;
	private int importe;
	
	
	public Prestamo(Persona cliente, int interes, int importe) {
		super();
		this.cliente = cliente;
		this.interes = interes;
		this.importe = importe;
	}
	public Prestamo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean mayoredad(){
		if(cliente.getEdad() > 18){
			return true;
		}else{
			return false;
		}
	}
	public int tieneingresos(){
			
		if(cliente.getSalario() > 25000){
			return 25000;
		}else{
			return cliente.getSalario();
		}
	}
	
	
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public int getInteres() {
		return interes;
	}
	public void setInteres(int interes) {
		this.interes = interes;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}


	@Override
	public String toString() {
		return "prestamo [cliete=" + cliente + ", interes=" + interes
				+ ", importe=" + importe + "]";
	}
	
	
}
