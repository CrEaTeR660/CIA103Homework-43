package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {

		MyRectangle x = new MyRectangle();
		System.out.println("長方形面積是" + x.getArea());
//	使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

		MyRectangle y = new MyRectangle(10.0, 20.0);
		System.out.println("長方形面積是" + y.getArea());
//	使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

	}
}