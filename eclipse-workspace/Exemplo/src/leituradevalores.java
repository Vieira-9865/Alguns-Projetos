


import java.util.Scanner;
public class Testescanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome da pessoa: ");
		String nome = scan.next();
		System.out.print("Peso em kg: ");
		int peso = scan.nextInt();
		System.out.println(nome+" pesa "+ peso+" kilos");

	}

}
