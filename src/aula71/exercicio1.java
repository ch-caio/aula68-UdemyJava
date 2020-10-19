package aula71;
import java.util.Locale;
import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dollar Price: ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many Dollars will be bought: ");
		double dollarQuant = sc.nextDouble();
		
		double priceInReal = calculator.convertToReal( dollar,  dollarQuant);
		
		System.out.printf("Amount to be paid in reais: %.2f%n"+priceInReal);
		sc.close();
	}

}
