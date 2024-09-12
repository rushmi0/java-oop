
public abstract class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public Shape() {
		this.color = null; // this(null);
	}

	public String toString() {
		return "color=" + this.color;
	}

	public abstract double getArea();

}
