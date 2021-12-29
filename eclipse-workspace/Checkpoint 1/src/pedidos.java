
import java.util.ArrayList;

import java.util.Scanner;

public class pedidos {
	Scanner scan = new Scanner(System.in);
	int QuantidadeCombo;
	double ValorTotal;
	int NumeroPedido = 0;
	String Observação;
	String cliente;
	double vit = 0;    
    
	ArrayList<pedidos> listaPed = new ArrayList<>();
	
	

	public int getQuantidadeCombo() {
		return QuantidadeCombo;
	}

	public void setQuantidadeCombo(int quantidadeCombo) {
		QuantidadeCombo = quantidadeCombo;
	}

	public double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	public int getNumeroPedido() {
		return NumeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		NumeroPedido = numeroPedido;
	}

	public String getObservação() {
		return Observação;
	}

	public void setObservação(String observação) {
		Observação = observação;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	// VER LISTA DE PEDIDOS
	public void verDetalhesPedidos() {
		 scan = new Scanner(System.in);
		for (int i = 0; i < listaPed.size(); i++) {
		
			System.out.println("Número do Pedido: " + listaPed.get(i).getNumeroPedido());
			System.out.println("____________________________");
			System.out.println("Quantidade do Combo: " + listaPed.get(i).getQuantidadeCombo());
			System.out.println("____________________________");
			System.out.println("Valor Total: " + listaPed.get(i).getValorTotal());
			System.out.println("____________________________");
			System.out.println("Observação: " + listaPed.get(i).getObservação());
			
			
		}		
		
	}
	
	public void infoped(int numpd, int qtcombo, double vt, String obs, String clientinho) {
		
		setNumeroPedido(numpd);
		setQuantidadeCombo(qtcombo);
		setValorTotal(vt);
		setObservação(obs);
		setCliente(clientinho);
		
}

	public void adicionapedido() {
		
	    System.out.println("Digite o nome do cliente: ");
	     String client = scan.nextLine();
	      client = client.toUpperCase();
	    
	    
		System.out.println("Digite a o número do pedido: ");
		  int num = scan.nextInt();
		
		
        System.out.println("Digite a quantidade de combos do pedido: ");
          int qt = scan.nextInt();
        
        
        float vit = (float) (qt*23.99);
           
        scan = new Scanner(System.in); 
        System.out.println("Digite a sua Observação: ");
         String ob = scan.nextLine();
          ob = ob.toUpperCase();
        
        infoped(num, qt, vit, ob, client);

   

        System.out.println("Nome do cliente: "+ client);
        System.out.println("____________________________");
        System.out.println("Pedido de numero " + num);
        System.out.println("____________________________");
        System.out.println("Quantidade de combos: " + qt); 
        System.out.println("____________________________");
        System.out.println("Valor final: " + vit);
        System.out.println("____________________________");
        System.out.println("Observação: " + ob);
        
        
        
    }

   public void atualizarpedido() {
	   
	   int numpedidozinho = getNumeroPedido();
       int combinho = getQuantidadeCombo();
       String obss = getObservação();
       String nameuser = getCliente();
       
       
                
                
				System.out.println("Digite o nome do cliente: ");
	              nameuser = scan.nextLine();
	              nameuser = nameuser.toUpperCase();
				
                
                
			    System.out.println("Digite o novo numero do pedido:");
	              numpedidozinho = scan.nextInt();
	            
                
               
                 scan = new Scanner(System.in);
	            System.out.println("Digite a nova quantidade de combos:");
	              combinho = scan.nextInt();
                
                scan = new Scanner(System.in);
                
	            System.out.println("Digite a nova Observação:");
	              obss = scan.nextLine();
	              obss = obss.toUpperCase();
                
	            
	            float vtotal = (float) (combinho*23.99);
	            
	            infoped(numpedidozinho, combinho, vtotal, obss, nameuser);
	            
	            System.out.println("Nome do cliente: "+ nameuser);
	            System.out.println("____________________________");
	            System.out.println("Pedido de numero " + numpedidozinho);
	            System.out.println("____________________________");
	            System.out.println("Quantidade de combos: " + combinho);
	            System.out.println("____________________________");
	            System.out.println("Valor final: " + vtotal);
	            System.out.println("____________________________");
	            System.out.println("Observação: " + obss);
	            
	   }
	
}
