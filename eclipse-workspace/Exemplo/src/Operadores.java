
public class Operadores {

	public static void main(String[] args) {
		int x = 1;
		int y = x++;
		System.out.println(x+" "+y); // 2 1
		x = 1;
		y = ++x;
		System.out.println(x+" "+y); // 2 2
		x = 2;
		y += x; // y = y + x
		System.out.println(x+" "+y); // 2 4
		x = 1;
		y -= x;
		System.out.println(x+" "+y); // 1 3

	}

}
