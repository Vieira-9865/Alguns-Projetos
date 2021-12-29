
import java.util.ArrayList;
import java.util.Scanner;



public class checkpointapp {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		ArrayList <String> lista1 = new ArrayList<>();
		
		checkpointpt02 check2 = new checkpointpt02();
		
		checkpoint check = new checkpoint();
		
		int numped = 0;
		
		System.out.println( "M E N U");
		System.out.println(" 1- Ver Lista de Pedidos");
		System.out.println(" 2- Adicionar Pedido");
		System.out.println(" 3- Atualizar Pedido ");
		System.out.println(" 4- Remover um Pedido");
		System.out.println(" 5- Listar Clientes");
		System.out.println(" 6- Adicionar Clientes");
		System.out.println(" 7-Atualizar Dados do Cliente");
		System.out.println(" 8-Remover um Cliente");
		System.out.println(" 9-Listar Pedidos do Cliente");
		System.out.println(" 10-Cliente Número Um (Cliente que mais comprou combos)");
		System.out.println(" 0- Sair");
		
		
		System.out.println("Digite a opção desejada");
		int opcao = scan.nextInt();
		while (opcao != 10) {
			
			switch (opcao) {
			case 1:
				
				System.out.println("**** Você escolheu a opção de Ver Lista de Pedidos******");
				System.out.println("Todos os pedidos são esses:" + check.getPedidos());
				opcao = 10;
				break;
			case 2:
				System.out.println("**** Você escolheu a opção de Adicionar Pedido******");
				System.out.println("Digite a quantidade de combos");
				int quantcombo = scan.nextInt();
				System.out.println("Digite a Observação:");
				String obs = scan.nextLine();
				numped++;
				float vt = (float)(quantcombo * 23.99);
			
				check2.inserirpedido(numped, quantcombo, vt, obs); 
				
			
				break;
			case 3:
				
			default:
				break;
			}
		}
	}

}
