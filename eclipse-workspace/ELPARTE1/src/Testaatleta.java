
public class Testaatleta {

	public static void main(String[] args) {
		atleta atleta = new Atleta();
		atleta.AlteraDados("Felipe Massa", 27);
		
		System.out.println("O atleta" + atleta.revelaNome());
		
		System.out.println("tem" + atleta.revelaIdade() + " anos");
	}

}
