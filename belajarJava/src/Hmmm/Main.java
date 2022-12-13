package Hmmm;

public class Main {

	public static void main(String[] args) {
		Shape square = new Square(4);
		System.out.println(square.calculate());
		Shape triangle = new Triangle(4, 6);
		System.out.println(triangle.calculate());

	}

}
