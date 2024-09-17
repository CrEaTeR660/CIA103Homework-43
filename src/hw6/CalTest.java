package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		try {
            System.out.print("請輸入x值: ");
            int x = sc.nextInt();

            System.out.print("請輸入y值: ");
            int y = sc.nextInt();

            int result = calculator.powerXY( x, y);
            System.out.println(x + " 的 " + y + " 次方為: " + result);
        } catch (CalException e) {
            System.out.println("錯誤: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("輸入錯誤，請輸入有效的整數。");
        } finally {
            sc.close();
		}
	}

}
