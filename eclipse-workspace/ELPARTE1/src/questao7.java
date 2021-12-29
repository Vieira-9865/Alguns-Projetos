import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     double velmax = 0;
     double velusuario = 0;
     double multa = 0.0;
     
     System.out.println("Digite a velocidade máxima permitida da via?");
     velmax = scan.nextDouble();
     System.out.println("Digite o valor da sua velocidade na via?");
     velusuario = scan.nextDouble();
     
     if (velusuario >= velmax && velusuario <= (velmax + 10) ) {
		multa += 50;	
	}
     else if (velusuario >= (velmax + 11) && velusuario <= (velmax + 30)) {
		multa += 100;
	}
     else if (velusuario >= (velmax + 31)) {
 		multa += 200;
	}
     System.out.println("Você ganhou uma multa de " + multa + " reais");
 }
}
	