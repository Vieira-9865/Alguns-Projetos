import java.util.Scanner;
public class mediadosvalores {

	   public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in); 
			int valor1 = scan.nextInt();
			int valor2 = scan.nextInt();
			int media = (valor1 + valor2) / 2;
			
			System.out.println("A média dos valores é" + media);
		

	}

}
