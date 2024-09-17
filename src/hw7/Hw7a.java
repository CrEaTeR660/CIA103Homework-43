package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hw7a {

	// 請寫一個程式，可以在讀入一個檔案後，顯示有多少個位元組
	static int reader(FileInputStream fi) throws IOException {
		int count = 0;
		while ((fi.read()) != -1) { //檔案如果-1代表沒有資料了
			count += 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

		File inputFile = new File("C:/CIA103_Workspace/Homework-43/Sample.txt");

		try (
				FileInputStream fis = new FileInputStream(inputFile);
				FileReader fr1 = new FileReader(inputFile);
				FileReader fr2 = new FileReader(inputFile);

				BufferedReader br = new BufferedReader(fr2);) {
			
			int count = 0, count2 = 0, count3 = 0;
			String str;
			count = reader(fis);

			while ((fr1.read()) != -1) {
				count2 += 1;
			}

			while ((str = br.readLine()) != null) {
				if (str.length() > 0) {
					count3 += 1;
				}
			}
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料 %n", count, count2, count3);
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();//印出異常例外
		}
	}
}
