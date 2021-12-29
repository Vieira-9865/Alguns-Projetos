import java.util.Scanner;

public class flagzero {

	public static void main(String[] args) {
	  Scanner leitura = new Scanner(System.in);
	  int valor = leitura.nextInt();
	  int soma = 0;
	  int cont = 0;
	  
	  while (valor != 0)  {
		  soma += valor;
		  cont++;
		  valor = leitura.nextInt();
	  }
      double media = (double) soma / cont;
      System.out.println(media);
	}

}
