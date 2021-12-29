import java.util.Scanner;

public class AppAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Alunos aluno = new Alunos();
		
		System.out.println( "M E N U");
		System.out.println(" 1- Add Aluno");
		System.out.println(" 2- Remover Aluno");
		System.out.println(" 3- Listar Alunos");
		System.out.println(" 4- Sair");
		
		System.out.println("Digite a opção desejada");
		int opção = scan.nextInt();
		while (opção != 4) {
			
			switch (opção) {
			case 1:
		System.out.println("**** Você escolheu a opção de adicionar um novo aluno******");
		System.out.println("Digite a matrícula do aluno: ");
		String matricula = scan.nextLine();
		System.out.println("Digite o nome do aluno: ");
		String nome = scan.nextLine();
		System.out.println("Digite a idade do aluno:  ");
		int idade = scan.nextInt();
		System.out.println("Digite o sexo do aluno (M ou F): ");
		String sexo = scan.nextLine();
		 aluno.inserirAluno(matricula, nome, idade, sexo.charAt(0));
				break;

			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			default:
				break;
			}
			
		}
		
		

	}

	private static void inseriraluno(String matricula, String nome, int idade, char charAt) {
		// TODO Auto-generated method stub
		
	}

}
