import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sch = new Scanner(System.in);
		int input1 = sch.nextInt();
		int input2 = sch.nextInt();
		int input3 = sch.nextInt();
		if (input1 < input2 && input1 < input3) {
			System.out.println(input1);
		}
		else if (input2 < input1 && input2 < input3) {
			System.out.println(input2);
		}
		else {
			System.out.println(input3);
		}
	}
}
