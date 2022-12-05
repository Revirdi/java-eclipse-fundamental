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
		sayHello(new Manager("Revirdi"));
		sayHello(new VicePresident("no life"));

	}
	
	static void sayHello(Employee employee) {
		if(employee instanceof VicePresident) {
			System.out.println("Hello VP " + employee.name );
		} else if(employee instanceof Manager) {
			System.out.println("Hello Manager " + employee.name );
		} else {
			System.out.println("Hello Employee " + employee.name );
		}
		
		
	}
}
