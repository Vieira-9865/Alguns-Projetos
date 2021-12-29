
public class expedroxtom {

	public static void main(String[] args) {
		double pedro = 1.2;
		double tom = 1.1;
		int anos = 0;
		while (tom < pedro) {
			anos++;
			tom += 0.03;
			pedro += 0.02;			
		}
        System.out.println(anos + " anos");
	}

}
