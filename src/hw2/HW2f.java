package hw2;

public class HW2f {
	public static void main(String[] args) {
		
		for (int row = 1; row < 7; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print((char) +('A' + row - 1));

			}
			System.out.println();
		}
	}
}