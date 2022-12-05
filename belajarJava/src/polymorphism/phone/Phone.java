package polymorphism.phone;

public class Phone {
	private String model;

	public Phone(String model) {

		this.model = model;
	}

	public void feature() {
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return model;
	}

}
