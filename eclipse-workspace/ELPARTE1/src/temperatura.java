import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite os graus em F° ou 0 (zero) para sair");
		double temperatura = scan.nextDouble();
		
		while (temperatura != 0) {
			double C = 5 * (temperatura-32)/9;
			System.out.println("******Tabela******");
			System.out.println("F°"+ temperatura + "  -> C°" + C);
			
			System.out.println("Digite os graus em F° ou 0 (zero) para sair");
			temperatura = scan.nextDouble();
		}

	}

}
