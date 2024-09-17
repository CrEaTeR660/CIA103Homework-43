package hw3;

import java.util.Scanner;

public class Hw3b {
	public static void main(String[] args) {

		int i;
		double d;

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧");

		if (sc.hasNextInt()) {
			i = sc.nextInt();
		}
		if (sc.hasNextDouble())
			d = sc.nextDouble();
	}

	 int a;
	ans = (int)(Math.random()*10);

	for(int x = 0; x == ans;){
		
		if (x == a) {
			System.out.println("答對了!答案就是" + a);
			break;
		} else {
			System.out.println("猜錯囉!");
		}
	}

}

}