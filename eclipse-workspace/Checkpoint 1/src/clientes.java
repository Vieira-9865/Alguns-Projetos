import java.util.Scanner;

public class clientes {
	Scanner scan = new Scanner(System.in);
	 String Nome;
	 String Telefone;
	 String Endereco;
	
	

	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getTelefone() {
		return Telefone;
	}



	public void setTelefone(String telefone) {
		Telefone = telefone;
	}



	public String getEndereco() {
		return Endereco;
	}



	public void setEndereco(String endereco) {
		Endereco = endereco;
	}



	public void infocliente(String nome, String tel, String end) {
		setNome(nome);
		setTelefone(tel);
		setEndereco(end);
	}
	
	public void adicionarcliente() {
		scan = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String nm  = scan.nextLine();
		nm = nm.toUpperCase();
        System.out.println("Digite o número de telefone do cliente: ");
        String tl = scan.nextLine();
        tl = tl.toUpperCase();      
        System.out.println("Digite o endereço do cliente: ");
        String ed = scan.nextLine();
        ed = ed.toUpperCase();
        infocliente(nm, tl, ed);
   
        System.out.println("Nome do cliente: "+ nm);
        System.out.println("Telefone " + tl);
        System.out.println("Endereço: " + ed);
	}
	
	public void atualizarcliente() {
		String nom = getNome();
	    String tlfone = getTelefone();
	    String edreco = getEndereco();
	       
		   
	        
	               
				    System.out.println("Digite o novo nome do cliente:");
		              nom = scan.nextLine();
		              nom = nom.toUpperCase();
                 
                     
		            System.out.println("Digite o novo telefone do cliente:");
		              tlfone = scan.nextLine();
		              tlfone = tlfone.toUpperCase();
                     
                    
                    
		            System.out.println("Digite o novo Endereço do cliente:");
		              edreco = scan.nextLine();
		              edreco = edreco.toUpperCase();
                    
                     
		            infocliente(nom, tlfone, edreco);
		            
		            System.out.println("Nome do cliente: "+ nom);
		            System.out.println("Telefone " + tlfone);
		            System.out.println("Endereço: " + edreco); 
		            
	}
}
