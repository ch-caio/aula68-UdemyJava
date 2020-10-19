package aula68exercicio2;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ClasseExercicio3 emp = new ClasseExercicio3 ();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("First Trimester note: ");
		emp.FirstTrimester = sc.nextDouble();
		System.out.println("First SecondTrimester note: ");
		emp.SecondTrimester = sc.nextDouble();
		System.out.println("First ThirdTrimester note: ");
		emp.ThirdTrimester = sc.nextDouble();
		System.out.println();
		
		emp.setFirstTrimester();
		emp.setSecondTrimester();
		emp.setThirdTrimester();
		emp.setResult();
		System.out.println();
		System.out.println(""+emp.showResult());
		sc.close();
	}

}
 