import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		um uno = new um();
		
		System.out.println("digite primeiro valor");
		int res1 = scan.nextInt();
		uno.setNum(res1);
		System.out.println("digite segundo valor");
		int res2 = scan.nextInt();
		uno.setNum2(res2);
		
		System.out.println("digite qual opefração vc quer usar");
		int op = scan.nextInt();
		switch(op) {
		case 1:
			uno.Somar();
			System.out.println(uno.getRes());
			break;
		case 2:
			uno.Diminuir();
			System.out.println(uno.getRes());
			break;
		case 3:
			uno.Multiplicar();
			System.out.println(uno.getRes());
			break;
		case 4:
			uno.Dividir();
			System.out.println(uno.getRes());
			break;
		}
		scan.close();
	}
	
}
