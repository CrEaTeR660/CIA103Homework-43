package hw4;

public class Hw4f {
	public static void main(String[] args) {
	int  [][] exam = {{10, 35, 40, 100, 90, 85, 75, 70},
			     {37, 75, 77, 89, 64, 75, 70, 95},
			     {100, 70, 79, 90,75, 70, 79, 90},
			     {77, 95, 70, 89, 60, 75, 70, 85,89},
			     {90, 80, 100, 75, 50, 20, 99,75}};
	// 用於儲存每位同學考最高分的次數
    int[] topScores = new int[8];

    // 遍歷每次考試，找出每次考試的最高分
    for (int i = 0; i < exam.length; i++) {
        int maxScore = -1;
        int studentIndex = -1;

        // 找出該次考試的最高分和最高分學生的索引
        for (int j = 0; j < exam[i].length; j++) {
            if (exam[i][j] > maxScore) {
                maxScore = exam[i][j];
                studentIndex = j;
            }
        }

        // 增加該學生考最高分的次數
        if (studentIndex != -1) {
            topScores[studentIndex]++;
        }
    }

    // 輸出每位同學考最高分的次數
    for (int i = 0; i < topScores.length; i++) {
        System.out.println("Student " + (i + 1) + " got the highest score " + topScores[i] + " times.");
    }
	}

}
