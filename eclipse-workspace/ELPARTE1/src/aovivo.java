import java.util.Scanner;

public class aovivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomefuncrico = "";
		String nome = "";
		double media, soma = 0;
		int cont = 0;
		double maiorSalario = 0;
		double salario = 0;
		do {
			scan = new Scanner(System.in);			
			System.out.println("Digite o nome do funcionário");
		    nome = scan.nextLine();
		
		   if (nome.equalsIgnoreCase("fim")) {
			   break;
		}
		
			System.out.println("Digite o salário do funcionário");
		    salario = scan.nextDouble();
		    
		    cont++;
		    soma += salario;
		    
		    if (maiorSalario < salario ) {
				maiorSalario = salario;
				nomefuncrico = nome;
			}
			
			
		} while (!nome.equalsIgnoreCase("fim")); 
		media = soma / cont;
		System.out.println("A média de salarios é:" + media );
		System.out.println("O funcionário que ganha mais é: " + nomefuncrico);
	}

}
