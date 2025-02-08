import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sch = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		int a = sch.nextInt();
		int finalAmt = 0;
		if (a < 500) {
			finalAmt = a + 0;
		}
		else if (a >= 500 && a<=1000) {
			finalAmt = a - (a * 10 /100); 
		}
		else if (a > 1000) {
			finalAmt = a - (a * 20 /100);
		}
		System.out.println("Final Amount "+ finalAmt);
	}
}