package belajarOOP;

class VicePresident extends Manager {
	String jabatan = "VicePresident";
	VicePresident(String name){
		super(name); // memanggil constructor milik parent, wajib ditulis apabila constructor di parent memiliki parameter
	}
	
	
	void sayHello(String name) {
		System.out.println("Hello " + name + " my name is VP " + this.name);
	}
}
