import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do aluno:");
		String nome = scan.next();
		System.out.println("Digite a nota 1");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota 2");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a nota 3");
		double nota3 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 5.0) {
			System.out.println(nome + " está aprovado!");
		} else {
            System.out.println(nome + " está reprovado!"); 
		}

	}

}
