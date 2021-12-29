import java.util.Scanner;
//MAIOR NÚMERO

public class seleção {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int valor1 = scan.nextInt();
	  int valor2 = scan.nextInt();
	  System.out.print("O maior valor lido foi: ");
	  if (valor1 > valor2) {
		  System.out.println(valor1);
	  }   else {
		  System.out.println(valor2);
	  
	  }
	}

}
