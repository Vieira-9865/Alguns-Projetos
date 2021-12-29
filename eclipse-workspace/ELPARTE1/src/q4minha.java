import java.util.Scanner;

public class q4minha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) {	
			
			String rica, ale;
			double salrica, salale;
			System.out.println("Digite o nome do primeiro programador");
			rica = scan.nextLine();
			System.out.println("Digite o nome do segundo programador");
			ale = scan.nextLine();
			System.out.println("Digite o salário de " + rica);
			salrica = scan.nextDouble();
			System.out.println("Digite o salário de " + ale);
			salale = scan.nextDouble();
			
			if (salrica > salale) {
				System.out.println("O salário de " + rica + " é o maior do que o de " + ale);
				
			}  if (salale > salrica) {
				System.out.println("O salário de " + ale + " é o maior do que o de " + rica);
			} if (salrica == salale)  {
				System.out.println("O salário dos dois são iguais!");
			}
		}
	}

}
