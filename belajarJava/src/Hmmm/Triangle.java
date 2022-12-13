package Hmmm;

public class Triangle extends Shape {

	public Triangle(Integer base, Integer height) {
		super(base, height);

	}

	public int calculate() {
		return this.getBase() * this.getHeight() / 2;
	}

}
