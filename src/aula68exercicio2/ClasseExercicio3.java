package aula68exercicio2;

public class ClasseExercicio3 {
	
	public String name,result;
	public Double FirstTrimester;
	public Double SecondTrimester;
	public Double ThirdTrimester;
	public Double calculo;
	
	public Double setFirstTrimester () {
		return FirstTrimester * 0.30;
	}

	public Double setSecondTrimester () {
		return SecondTrimester * 0.35;
	}

	public Double setThirdTrimester () {
		return ThirdTrimester * 0.35;
	}

	public String setResult () {
		calculo = FirstTrimester+SecondTrimester+ThirdTrimester;
		
		if (calculo < 60) {
			result = "FAILD, you need "+(60-calculo)+" more points to pass";
		} else result = "PASSED! you need " ;
		
		return result;
	}
	
	
	public String showResult () {
		return "name: " +name+ "\nFirst Trimester: " +FirstTrimester+
				"\nSecond Trimester: "+SecondTrimester+
				"\nThird Trimester: "+ThirdTrimester+
				"\nresult: "+result
				;
	}

}
