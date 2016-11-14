package grupo02.mockito;

import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;

public class TestMultiplicar {
	@Test
	 public void testMultiplicacion() {
	  /**
	   * Se hace la prueba unitaria de la multiplicacion
	   * */
	 Multiplicar m= new Multiplicar();
	 Assert.assertEquals(m.multiplicar(2, 3),6);
	  
	 }
	@Test
	 public void testmultiplicarSumar() {
	  /**
	   * ¿Que pasaria si llamamos al metodo de B que llama a A?
	   * */
		
		/**
		 * OPCIÓN SIN MOCKITO -- CASCA
		 * */
//	 Sumar s=new Sumar();	  
//	 Multiplicar m= new Multiplicar();
//	  
//	  
//	 m.sets(s);
//	 Assert.assertEquals(m.multiplicarSumar(2, 3, 2),10);
//		
		/**
		 * OPCIÓN CON MOCKITO -- BIEN!
		 * */
	 Sumar servicioA = mock(Sumar.class);
	 when(servicioA.sumar(2,3)).thenReturn(5);
	  
	 Multiplicar servicioB= new Multiplicar();
	 servicioB.sets(servicioA);
	 Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2),10);
	 
	 /**
	  * Ahora ya no llama al metodo que hemos forzado que este mal
	  * ya tiene el valor dado
	  * 
	  * */
	  
	 
	 }
}
