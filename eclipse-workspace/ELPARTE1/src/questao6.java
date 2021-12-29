import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o mês á ser contabilizado os dias : ");
		int mes = scan.nextInt();
		switch (mes) {
		case 1:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		case 2:
			System.out.println("O mês que você escolheu tem 28 dias");
			break;
		case 3:
			System.out.println("O mês que você escolheu tem 30 dias");
			break;
		case 4:
			System.out.println("O mês que você escolheu tem 30 dias");
			break;
		case 5:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		case 6:
			System.out.println("O mês que você escolheu tem 30 dias");
			break;
		case 7:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		case 8:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		case 9:
			System.out.println("O mês que você escolheu tem 30 dias");
			break;
		case 10:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		case 11:
			System.out.println("O mês que você escolheu tem 30 dias");
			break;
		case 12:
			System.out.println("O mês que você escolheu tem 31 dias");
			break;
		default:
			System.out.println("O número digitado não representa um mês especifico! ");
			break;
		}
		

	}

}
