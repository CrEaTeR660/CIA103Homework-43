package hw5;

public class MyRectangle {
	private double width = 10;
	private double depth = 20;

	public MyRectangle() {
	};

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}
}