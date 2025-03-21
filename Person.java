public class Person{
	
	Integer age;
	String name;
	
	public Person(String name, Integer age) {
		this.name = name;
		if (age == null) {
			this.age = 18;
		}
		else {
			this.age = age;	
		}
	}
	public Person(String name) {
		this.name = name;
		age = 18;
	}

	public void display() {
		System.out.println("name "+name+" and age "+age);
	}
	
	public static void main(String[] args) {
		Person q1 = new Person("Azhagiri");
		q1.display();
		//System.out.println("giri");
	}
}
