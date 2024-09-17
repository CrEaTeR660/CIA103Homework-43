package hw3;

import java.util.Scanner;

public class Hw3a {
	public static void main(String[] args) {

		 boolean i;
		double d;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入：");
			if (sc.hasNextInt()) {
				i = sc.hasNextInt();
			}
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
			}
		}
		int[] l = new int[3];
		
		if (l[0] * l[1] * l[2] != 0) {
			if (l[0] == l[1] && l[1] == l[2]) {
				
				System.out.println("正三角形");
				
			} else if (l[0] == l[1] || l[1] == l[2]) {
				
				System.out.println("等腰三角形");
			}

			else if (l[0] + l[1] > l[2] && l[1] + l[2] > l[0] && l[0] + l[2] > l[1]) {
				System.out.println("其他三角形");
			} else {
				System.out.println("不是三角形");
			}

		}
	}
}
