package hw4;

import java.util.Scanner;

public class Hw4d {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1000 } };
		System.out.println("請問你想借的金額:");
		int number = sc.nextInt();
		int sum = 0;
		System.out.println("有錢可借的員工編號:");

		for (int i = 0; i < money.length; i++) {
			if (number <= money[i][1]) {
				sum += 1;
				System.out.print(money[i][0] + " ");

			}
		}
		System.out.println("共 " + sum + " 人!");

	}
}
