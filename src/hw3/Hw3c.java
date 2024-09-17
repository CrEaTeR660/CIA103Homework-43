package hw3;

import java.util.Scanner;

public class Hw3c {
	public static void main(String[] args) {
	int i;
	@SuppressWarnings("unused")
	double j;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入不想要的數字");
	if(sc.hasNextInt()) {
		i = sc.nextInt();
	}
	if(sc.hasNextDouble()) {
		j = sc.nextDouble();
	}

	System.out.println("可選擇的數字");
	int num = 0;
	for(i = 1; i <= 49; i++ ) {
		if(!(i >= 10 && i / 10 == num) || i % 10 == num) {
		System.out.println(i + "\t");
		num ++;
		}
		if(( i % 10 == 0)) {
		System.out.println();
		}
	}
	System.out.println();
	System.out.println("共用"+ num + "個數字可選擇");
	
	}
	
	
	}


