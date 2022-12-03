package belajarOOP;
 class Manager extends Employee {
	String jabatan = "Manager";
	 Manager(String name){ // Constructor
		 super(name);
	 }
	 
	 void sayHello(String name) {
		 System.out.println("Hello " + name + " my name is Manager " + this.name);
	 }
}
