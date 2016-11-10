package grupo02.mockito;

public class Multiplicar{
	 
	

	private Sumar s;
	
	 /**
	  * Operaciones matemáticas
	  */
	 public Multiplicar(Sumar s) {
			super();
			this.s = s;
		}
	 public Multiplicar() {
			super();
		}
	 public int multiplicar(int a ,int b) {
		  
		 return a*b;
	 }
	 public int multiplicarSumar(int a ,int b,int multiplicador) {
		/**
		 * Metodo que llama al la clase ServicioA
		 * */  
		System.out.println("Ha entrado a clase multiplicarSumar");

		 return s.sumar(a, b)*multiplicador;
	  
	 }
	 /**
	  * Puntero a la clase ServicioA - get y set
	  */
	  
	 public Sumar gets() {
		 return s;
	 }
	 
	 public void sets(Sumar s) {
		 this.s = s;
	 }
	 
	 
	  
	 
	}
