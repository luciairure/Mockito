package grupo02.mockito;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPrestamo {
//	 	@Test
//	public void test() {
//		Persona cliente = new Persona("lucia", 24, 0);
//		Prestamo p = new Prestamo(cliente, 2, 10000);
//		
//		 Assert.assertTrue(p.mayoredad());
//		 Assert.assertEquals(p.tieneingresos(), 25000);
//
//		 
//	}
	@Test
	 public void test2() {
		/*
		 * Creamos la persona con un Mock - introducimos la edad
		 * 
		 * **/
		Persona cliente2 = mock(Persona.class);
		when(cliente2.getEdad()).thenReturn(17); 
		when(cliente2.getSalario()).thenReturn(50000);
		Prestamo p = new Prestamo(cliente2, 2, 10000);
		
		 Assert.assertFalse(p.mayoredad());
		 
		Assert.assertEquals(p.tieneingresos(), 25000);

		 
	}
}
