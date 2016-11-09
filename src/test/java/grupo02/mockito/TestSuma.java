package grupo02.mockito;

import org.junit.Assert;
import org.junit.Test;

public class TestSuma {
	 @Test
	 public void testSuma() {
		 /**
		  * Se hace la prueba unitaria de la suma
		  * */ 
		
		 Sumar s= new Sumar();
		 Assert.assertEquals(s.sumar(2, 2),4);
		  
		 }
	}