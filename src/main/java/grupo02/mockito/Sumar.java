package grupo02.mockito;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sumar{
	 
	public int sumar(int a ,int b) {
	  
		final Logger logger = LogManager.getLogger(Sumar.class);
		
		logger.debug("Ha entrado en sumar() de la clase SUMAR");
		return a+b;
		
		
		
		
		
		
		//return a+b+1;
		/**
		 * return a+b; funciona correctamente
		 * return a+b+1; casca
		 * */
	 }
}
