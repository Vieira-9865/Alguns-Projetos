import java.util.ArrayList;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		/// COLOQUEI OS ARRAY LISTS AQUI PARA PUXAR AS INFORMAÇÕES DESSAS CLASSES INCLUSIVE O GET AND SET
		ArrayList<clientes> Listaclientes = new ArrayList<clientes>();
		ArrayList<pedidos> ListaPedidos = new ArrayList<pedidos>();
		
		
		
////// ADICIONANDO TRY PARA CASO DÊ ALGUM ERRO NO CÓDIGO TRANSMITIR A MENSAGEM//
		try {
			System.out.println("___________________________________________________________________________________");
			System.out.println( "********M E N U********");
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
			System.out.println(" 11-Cliente que menos comprou combos");
			System.out.println(" 0- Sair");
			System.out.println("___________________________________________________________________________________");
			int opcao = scan.nextInt();
			/// ENQUANTO OPÇÃO FOR IGUAL A ZERO ELE NÃO VAI EXECUTAR OS COMANDOS//
			while (opcao != 0 ) {
				
				switch (opcao) {
				case 1: {
					 
					System.out.println("***** Você escolheu de Ver Lista de pedidos*****");
					/// PARA ADICIONAR AS INFORMAÇÕES DA OUTRA CLASSE USANDO A VARIÁVEL DA ARRAY LIST
						
					for (int i = 0; i < ListaPedidos.size(); i++) {
						
						System.out.println("Nome do cliente: " + ListaPedidos.get(i).getCliente());
						System.out.println("Número do Pedido: " + ListaPedidos.get(i).getNumeroPedido());
						System.out.println("Quantidade do Combo: " + ListaPedidos.get(i).getQuantidadeCombo());
						System.out.println("Valor Total: " + ListaPedidos.get(i).getValorTotal());
						System.out.println("Observação: " + ListaPedidos.get(i).getObservação());
						System.out.println("___________________________________________________________________________________");
						
						
					}		
					break;
				}
                case 2: {
                	pedidos ped2 = new pedidos();
                	System.out.println("***** Você escolheu de Adicionar pedidos*****");
                	System.out.println("___________________________________________________________________________________");
                	ped2.adicionapedido();
                	
                	ListaPedidos.add(ped2);
                
                	
					break;
				}
                case 3: {
                	pedidos ped3 = new pedidos();
					
					
					System.out.println("***** Você escolheu Atualizar pedido*****");
					System.out.println("___________________________________________________________________________________");
					System.out.println("Qual o número do pedido você deseja atualizar?");
					   int peduser = scan.nextInt();
					   int pedadm;
					   
					   for (int i = 0; i < ListaPedidos.size(); i++) {
						   pedadm = ListaPedidos.get(i).getNumeroPedido();
						   
						   if (peduser == pedadm) {
							   ped3.atualizarpedido();
							   
							   ListaPedidos.remove(i);
							   ListaPedidos.add(i, ped3);
					   }
						   }
					break;
				}
                case 4: {
					
					
					System.out.println("***** Você escolheu Remover pedido*****");
					System.out.println("___________________________________________________________________________________");
					System.out.println("Qual o número do pedido você deseja remover?");
					   
					   
					   int peduse = scan.nextInt();
					   int pedadmin;
					
					   for (int i = 0; i < ListaPedidos.size(); i++) {
						   pedadmin = ListaPedidos.get(i).getNumeroPedido();
						   
						   if(peduse == pedadmin) {
							
	                            System.out.println("***** Pedido solicitado*****");
	                            System.out.print("Numero do pedido: " + ListaPedidos.get(i).getNumeroPedido());
	                            System.out.print("  Quantidade de combo: " + ListaPedidos.get(i).getQuantidadeCombo());
	                            System.out.println("  Valor final: " + ListaPedidos.get(i).getValorTotal());
	                            System.out.print("  Observação: " + ListaPedidos.get(i).getObservação());
	                            System.out.println("___________________________________________________________________________________");
	                            
	                            System.out.println("Tem certeza que deseja remover esse pedido? Digite '1' para 'sim' e '2' para 'não':");
	                            
	                            int pauto = scan.nextInt();
	                            
	                            if (pauto == 1){
	                            	ListaPedidos.remove(i);
	                            	System.out.println("___________________________________________________________________________________");
	                                System.out.println("*****O pedido selecionado foi removido com êxito! *****");
	                                
	                                
	                                i = ListaPedidos.size(); // ########## ATUALIZANDO A VARIÁVEL "i" PARA SAIR DO LOOP ##########
	                            }
	                            
	                        }else if(i == ListaPedidos.size()-1){
	                        	System.out.println("___________________________________________________________________________________");
	                            System.out.println("*****O pedido requisitado não foi encontrado! *****");
	                            
	                        }
							  
						   }
					   break;
					   }
                case 5:{
                	System.out.println("***** Você escolheu de Ver Lista de Clientes*****");
					/// PARA ADICIONAR AS INFORMAÇÕES DA OUTRA CLASSE USANDO A VARIÁVEL DA ARRAY LIST
						
					for (int i = 0; i < Listaclientes.size(); i++) {
						
						System.out.println("Nome do cliente: " + Listaclientes.get(i).getNome());
						System.out.println("Telefone do cliente: " + Listaclientes.get(i).getTelefone());
						System.out.println("Endereço do cliente: " + Listaclientes.get(i).getEndereco());
						System.out.println("___________________________________________________________________________________");
					}	
               break; 
               }
                
                case 6:{
                	clientes cl1 = new clientes();
                	System.out.println("***** Você escolheu de Adicionar clientes*****");
                	
                	cl1.adicionarcliente();
                	
                	Listaclientes.add(cl1);
                	
                	break;
                }
                
                case 7:{
                	
                	System.out.println("***** Você escolheu de Atualizar clientes*****");
                	System.out.println("Qual o nome do cliente que você deseja atualizar?");
					   String cluser = scan.next();
					   cluser = cluser.toUpperCase();
					   String cladm;
					   
					   for (int i = 0; i < Listaclientes.size(); i++) {
						   cladm = Listaclientes.get(i).getNome();
						   
						   if (cladm.equals(cluser)) {
							   clientes cl2 = new clientes();
							   
							   cl2.atualizarcliente();
							   
							   Listaclientes.remove(i);
							   Listaclientes.add(i, cl2);
							   i = 	ListaPedidos.size();
					   }
                }
					   break;
                }
                case 8: {
                	System.out.println("***** Você escolheu de Remover clientes*****");
                	   scan = new Scanner(System.in);
                	   System.out.println("____________________________");
					   System.out.println("Qual o nome do cliente você deseja remover?");
					   String nomuser = scan.nextLine();
					   
					   String nomadm;
					
					   for (int i = 0; i < Listaclientes.size(); i++) {
						   nomadm = Listaclientes.get(i).getNome();
						   
						   if(nomadm.equals(nomuser)) {
							scan = new Scanner(System.in);
	                            System.out.println("***** Cliente solicitado*****");
	                            System.out.print("Nome do cliente: " + Listaclientes.get(i).getNome());
	                            System.out.print("Telefone do cliente: " + Listaclientes.get(i).getTelefone());
	                            System.out.println(" Endereço do cliente: " + Listaclientes.get(i).getEndereco());
	                            System.out.println("________________________________");
	                            
	                            System.out.println("Tem certeza que deseja remover esse cliente? Digite '1' para 'sim' e '2' para 'não':");
	                            
	                            int nomauto = scan.nextInt();
	                            
	                            if (nomauto == 1){
	                            	Listaclientes.remove(i);
	                            	System.out.println("________________________________");
	                                System.out.println("*****O pedido selecionado foi removido com êxito! *****");
	                                
	                                
	                                i = Listaclientes.size(); // ########## ATUALIZANDO A VARIÃ�VEL "i" PARA SAIR DO LOOP ##########
	                            }
	                            
	                        }else if(i == Listaclientes.size()-1){
	                            System.out.println("*****O pedido requisitado não foi encontrado! *****");
	                            
	                        }
							  
						   }
                	break;
                }
                case 9:{
                	System.out.println("***** Você escolheu Listar pedidos do cliente*****");
					/// PARA ADICIONAR AS INFORMAÇÕES DA OUTRA CLASSE USANDO A VARIÁVEL DA ARRAY LIST
                	    scan = new Scanner(System.in);
						System.out.println("Digite o nome do cliente: ");
						String ncl = scan.nextLine();
						ncl = ncl.toUpperCase();
						
						
					for (int i = 0; i < ListaPedidos.size(); i++) {
						String nadm = ListaPedidos.get(i) .getCliente();
						
						if(nadm.equals(ncl))
						System.out.println("Nome do cliente: "+ ListaPedidos.get(i).getCliente());	
						System.out.print("Numero do pedido: " + ListaPedidos.get(i).getNumeroPedido());
                        System.out.print("  Quantidade de combo: " + ListaPedidos.get(i).getQuantidadeCombo());
                        System.out.println("  Valor final: " + ListaPedidos.get(i).getValorTotal());
                        System.out.print("  Observação: " + ListaPedidos.get(i).getObservação());
						System.out.println("________________________________");
					}	
               break; 
                }
                case 10: {
                	String NOMEDOCLIENTE = null;
                    float COMBOFAKE = 0;
                    for(int i=0; i<ListaPedidos.size(); i++){
                        float COMBOVERDADEIRO = ListaPedidos.get(i).getQuantidadeCombo();
                        
                        if (COMBOVERDADEIRO > COMBOFAKE){
                            COMBOFAKE = COMBOVERDADEIRO;
                            NOMEDOCLIENTE = ListaPedidos.get(i).getCliente();
                        }
                    }
                    
                    System.out.println("****** O cliente número 1 é: " + NOMEDOCLIENTE + "********");
                    break;
                }
                case 11: {
                	String NOMEDOCLIENTE = null;
                    float COMBOFAKE = 999999999;
                    for(int i=0; i<ListaPedidos.size(); i++){
                        float COMBOVERDADEIRO = ListaPedidos.get(i).getQuantidadeCombo();
                        
                        if (COMBOVERDADEIRO < COMBOFAKE){
                            COMBOFAKE = COMBOVERDADEIRO;
                            NOMEDOCLIENTE = ListaPedidos.get(i).getCliente();
                        }
                    }
                    System.out.println("****** O cliente mais PÃO DURO É: " + NOMEDOCLIENTE + "********");
                    break;
                }
              
				
					
				}
						
				/// COLOQUEI AQUI NO FINAL PARA QUE NO FINAL DA EXECUÇÃO DO CÓDIGO ELE FAZER UM LOOPING PARA AS OPÇÕES///
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
				System.out.println(" 11-Cliente que menos comprou combos");
				System.out.println(" 0- Sair");
				opcao = scan.nextInt();
			} 
		} catch (Exception e) {
		}
	}

}