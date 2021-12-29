package programação;
import java.util.ArrayList;
import java.util.Scanner;

public class appequipe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Equipe> listaEquipes = new ArrayList<Equipe>();
		for (int i = 1; i < 3; i++) {
			Equipe e = new Equipe();
			System.out.println("Digite o nome do "+ i + " time:");
			String Nomeequipe = scan.nextLine();
			System.out.println("Digite o nome do "+ i + " estado:");
			String Nomeestado = scan.nextLine();

			e.setNome(Nomeequipe);
			e.setEstado(Nomeestado);	
			listaEquipes.add(e);
		}
		for (Equipe equipes : listaEquipes) {
			System.out.println("Nome " + equipes.getNome());
			System.out.println("Estado " + equipes.getEstado() + " /n");
		}
	}
}
