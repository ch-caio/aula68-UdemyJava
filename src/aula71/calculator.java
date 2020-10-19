package aula71;

public class calculator {

	public static final Double IOF = 6.38;
		
	public static double convertToReal (double dollar, double dollarQuant) {
		return  ( dollar * dollarQuant ) * IOF;
	}
}
