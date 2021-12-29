import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o número: ");
		int numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println(numero+ " é um número par!" );
		} else {
			System.out.println(numero+ " é um número impar!" );

		}
		
		
				

	}

}
