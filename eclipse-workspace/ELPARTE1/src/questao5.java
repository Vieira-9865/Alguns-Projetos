import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double altura, pesoideal = 0.0;
		
		System.out.println("Digite sua altura");
		 altura = scan.nextDouble();
		
		System.out.println("Digite o seu sexo (M ou F) ?");
		String sexo = scan.next();
		
		char letra = sexo.charAt(0);
		
		
		if (letra == 'M') {
			 pesoideal = (72.7 * altura) -58;
		} else {
			 pesoideal = (66.1 * altura) -44.7;
		}
		System.out.println("o peso ideal de uma pessoa baseado na altura e no sexo é:" + pesoideal);
		
	}

}
