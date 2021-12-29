import java.util.ArrayList;
import java.util.Scanner;

public class listavip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaVip = new ArrayList <String>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o nome do " + i + "° usuário:");
			String nomeuser = scan.nextLine();
			listaVip.add(nomeuser);
		}
       for (String item : listaVip) {
		System.out.println(item);
	}
	}

}
