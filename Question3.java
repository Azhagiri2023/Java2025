public class Question3 {

	public static void main(String[] args) {
		int a = 12345;
		int b =0; 
		while (a!=0) {
			int bal = a % 10;
			b = b * 10 + bal;
			a = a/10;
		}
		System.out.println("b "+b);
	}
}