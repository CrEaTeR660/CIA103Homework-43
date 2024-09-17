package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MathRandomToFile {

	public static void main(String[] args) {
		Random random = new Random(); // 創建一個Random方法

		try {
			FileWriter writer = new FileWriter("Data.txt", true);// 創建一個writer物件，用append模式，紀錄每次傳入結果

			for (int j = 0; j < 10; j++) { // 將隨機0-1000的數字取隨機取10個寫入
				int number = random.nextInt(1000) + 1;
				writer.write(number + "\n"); // 每寫入一筆，換行
			}
			writer.close();// 關閉資料流
			System.out.println("數據已成功追加");

		} catch (IOException ce) {
			ce.printStackTrace();
		}

	}
}
