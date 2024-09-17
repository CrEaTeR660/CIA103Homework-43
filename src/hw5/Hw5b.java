package hw5;

import java.util.Random;

public class Hw5b {

	public static String getAutoCode() {
	
		char c [] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'0' };
		char code []  = new char[8];
		Random r = new Random();
	
		for(int j = 0; j < 8 ; j ++ ) {
			code[j] = c[r.nextInt(c.length)];
		}
		return new String(code);
	}
		public static void main(String[] args) {
			
			System.out.println("本次隨機生成驗證碼" + getAutoCode());
			
			
		}
		

	}

