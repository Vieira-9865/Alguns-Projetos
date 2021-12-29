import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("****Seja bem vindo ao nosso sistema de chatbot *****");
    System.out.println("****MENU*****");
    System.out.println("0-SAIR");
    System.out.println("1-CADASTRAR ATIVIDADE");
    System.out.println("2-ATUALIZAR ATIVIDADE");
    System.out.println("3-REMOVER ATIVIDADE");
    
    try {
    	
		System.out.println("Digite sua opção desejada:");
        int opçao = scan.nextInt();
        
        
       while (opçao != 0) {
    	   switch (opçao) {
   		
   		case 1:
   			System.out.println("Você escolheu cadastrar uma nova atividade!!");
   			break;
   		case 2:
   			System.out.println("Você escolheu atualizar uma atividade!!");
   			break;
   		case 3:
   			System.out.println("Você escolheu remover uma atividade!!");
   			break;
   		default:
   			System.out.println("Atenção! Você escolheu uma opção inválida! Tente novamente.");
   			break;
   		}
    	   System.out.println("Digite outra opção desejada");
    	   opçao = scan.nextInt();
	}
    
			System.out.println("Obrigado por utilizar nosso sistema. Até mais.");
			System.exit(0);
    	
	} catch (Exception e) {
		System.out.println("Atenção! Ocorreu um erro inesperado no sistema. favor contactar o Administrador do sistema.");
	}
	}

}
