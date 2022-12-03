package belajarOOP;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var vicePresident = new VicePresident("Ardwiyan");
		vicePresident.sayHello("Dwi"); // Hello Dwi my name is VP Ardwiyan
		
		// Polymorphism
		
		Employee employee = new Employee("Ardwiyan");
		employee.sayHello("Dwi"); // Hello Dwi my name is Employee Ardwiyan
		
		employee = new VicePresident("Ardwiyan");
		employee.sayHello("Dwi"); // Hello Dwi my name is VP Ardwiyan
		
		employee = new Manager("Ardwiyan");
		employee.sayHello("Dwi"); // Hello Dwi my name is Manager Ardwiyan
		
		sayHello(new Employee("Ardwiyan"));
		sayHello(new Manager("Ardwiyan"));
		sayHello(new VicePresident("Ardwiyan"));

	}
	
	static void sayHello(Employee employee) {
		System.out.println("Hello " + employee.name );
	}

}
