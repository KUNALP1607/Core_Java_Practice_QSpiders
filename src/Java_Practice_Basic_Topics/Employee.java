package Java_Practice_Basic_Topics;

public class Employee {
	
	static String companyName = "Google";
	
	String name;
	int age;
	float salary;
	
	Employee()
	{
		System.out.println("New Employee object created!!");
	}
	
	Employee(String name){
		this();
		this. name = name;
	}
	
	Employee(String name, int age){
		this(name);
		this.age = age;
	}
	
	Employee(String name, int age, float salary){
		this(name, age);
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Company Name : "+companyName);
		System.out.println("Employee name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Salary : "+salary);
		System.out.println();
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Kunal", 21, 600000);
		e1.displayDetails();
		
		Employee e2 = new Employee("Raju", 23, 700000);
		e2.displayDetails();
		
		Employee e3 = new Employee("Jaggu", 25, 1000000);
		e3.displayDetails();
	}

}
