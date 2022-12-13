package Hmmm;

public class Square extends Shape {

	public Square(Integer side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	public int calculate() {
		return this.getSide() * this.getSide();
	}

}
