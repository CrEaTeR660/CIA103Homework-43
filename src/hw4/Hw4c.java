package hw4;

public class Hw4c {
//	有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//	(提示：字元比對，String方法)
	public static void main(String[] args) {
		String [] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum = 0;
		for(int x = 0; x < planet.length; x ++ ) {
			for(int y = 0; y < planet[x].length(); y ++) {
				
				char t = planet[x].charAt(y);
				
				switch (t) {
				case 'a', 'e', 'i', 'o', 'u' :
				sum += 1;
				break;
				
				}
				System.out.println("這個陣列裡面共有" + sum + "個母音");
			}
			
		}
		

	}
}
