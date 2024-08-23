package hw2;

public class HW2C {
	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		while (b <= 10) {
			a *= b;
			b++;
		}
		System.out.println("1到10的連乘積是" + a);

	}

}
