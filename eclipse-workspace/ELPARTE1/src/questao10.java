import java.util.ArrayList;
import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> listaNumerosSelecionados = new ArrayList <Integer> ();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número a ser inserido no array list");
			int numero = scan.nextInt();
			
			listaNumerosSelecionados.add(numero);
		}
		
		for(int item : listaNumerosSelecionados) {
			if (item >= 100){	 
			System.out.println(item);
			
			} 
			
			}
	}

}
