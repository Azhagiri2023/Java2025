public class Account {
	int balanace = 10000;
	public void display() {
		System.out.println("Balance is "+balanace);
	}
	public void withdraw(int amt) {
		balanace = balanace - amt;
	}
	public void deposit(int amt) {
		balanace = balanace + amt;
	}
	public Account() {
		display();
	}
	public Account(String action, int amount) {
		if (action == "W") {
			withdraw(amount);
		}else if (action == "D") {
			deposit(amount);
		}
	}
	
	public static void main(String[] args) {
		Account ac = new Account();
		Account ac1 = new Account("W",500);
		System.out.println("Current balance "+ac1.balanace);
		Account ac2 = new Account("D",1500);
		System.out.println("Current balance "+ac2.balanace);
	}
}
