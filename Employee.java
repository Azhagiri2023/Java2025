class Person {
	String name;
    int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Employee extends Person {
  String EmployeeID;
  int salary;
  public Employee(){
	  super();
  }
  public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.EmployeeID = "IND0007";
	e1.salary = 28000;
	e1.setName("Azhagiri");
	e1.setAge(30);
	System.out.println("Employee ID : "+e1.EmployeeID);
	System.out.println("Salary : "+e1.salary);
	System.out.println("Name : "+e1.getName());
	System.out.println("Age : "+e1.getAge());
}
}