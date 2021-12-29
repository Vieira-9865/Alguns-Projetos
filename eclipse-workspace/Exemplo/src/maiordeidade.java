import java.util.Scanner;

public class maiordeidade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		System.out.print("Digite sua idade");
		
		if (idade >= 18 ) {
			System.out.println(nome + "é maior de idade");
		} else {
			System.out.println("Atenção!" + nome + "é menor de idade");
		}
	}

}
