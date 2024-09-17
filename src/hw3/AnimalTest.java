package hw3;

public class AnimalTest {
	public static void main(String[] args) {

		Animal tom = new Animal(2, 5.0f);
		Elephant kim = new Elephant(8, 1200.0f, "大象");
		Elephant may = new Elephant(9, 1300.0f, "大象");
		tom.speak();
		kim.speak();
		may.speak();

	}
}
