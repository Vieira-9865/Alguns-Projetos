import java.util.Scanner;

public class q4juliocerto {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            {
                System.out.println("diigite o nome do primeiro programador");
                String nome1 = scan.next();
                System.out.print("digite o primeiro salario: ");
                double sal1 = scan.nextDouble();
                System.out.println("digite o nome do segundo programador");
                String nome2 = scan.next();
                System.out.println("digite o segundo salario: ");
                double sal2 = scan.nextDouble();
                if (sal1 > sal2) {
                    System.out.println("O(A) "+ nome1 +" recebe mais!");
                }
                    if (sal1 < sal2) {
                        System.out.println("O(A) "+ nome2 +" recebe mais!");
                    } if (sal1 == sal2) {
                            System.out.println("Ambos funcionarios recebem igualmente!");
                        }


            }
        }

    }

}

	


