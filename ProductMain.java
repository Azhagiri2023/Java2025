import java.util.Scanner;

class Product {	
	int pid;
	double price;
	double quantity;
	public void retnStr() {
		System.out.println("print check");
	}
	public Product(int pid,double price,double quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
}

public class ProductMain {

	public static void main(String[] args) {
		int pid2;
		double price2;
		double quantity2;
		int arrLength = 2;
		double highPrice = 0.1;
		
		Scanner userInput = new Scanner(System.in);
		Product[] prod = new Product[arrLength];
		for (int i = 0; i< arrLength; i++) {
			System.out.println("Please enter the "+(i+1) +" product details");
			System.out.println("enter product ID :");
			pid2 = userInput.nextInt();
			System.out.println("enter price :");
			price2 = userInput.nextDouble();
			System.out.println("enter quantity :");
			quantity2 = userInput.nextDouble();
			prod[i] = new Product(pid2,price2,quantity2);
		}
		System.out.println("Total calculated amount is : "+calcTotAmt(prod));
		
		for (Product i : prod) {
			if (highPrice < i.price) {
				highPrice = i.price;
			}
		}
		System.out.println("high price "+highPrice);
		
	}
	public static double calcTotAmt(Product[] products) {
		double totAmt = 0;
		for (Product product : products) {
			totAmt = totAmt + (product.price * product.quantity);
		}
		return totAmt;
	}
	
}
