package Hmmm;

public class Shape {

	private Integer base;
	private Integer side;
	private Integer height;

	public Shape(Integer base, Integer height) {
		this.setBase(base);
		this.setHeight(height);
	}

	public Shape(Integer side) {
		this.setSide(side);
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	public int calculate() {
		return base;

	}

}
