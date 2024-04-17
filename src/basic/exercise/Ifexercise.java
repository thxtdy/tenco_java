package basic.exercise;

import java.util.Scanner;

public class Ifexercise {

	public static void main(String[] args) {

		// 정수값 입력받기 활용해서 코드에 흐름을 만들어 주세요.

		System.out.println("점수를 입력하십쇼(0-100)");

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		char grade = 'X';
		
		String message = "다시 입력해주세요.";
		
		if (score > 100 || score < 0) {
			System.out.println(message);
		
		} else if(score <= 100 && score >= 90) {
			System.out.print(grade = 'A');
			System.out.println(" 학점 : 우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.");
		
		} else if (score < 90 && score >= 80) {
			System.out.print(grade = 'B');
			System.out.println(" 학점: 좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!");
		
		} else if (score < 80 && score >= 70) {
			System.out.print(grade = 'C');
			System.out.println(" 학점: 괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.");
		
		} else if (score < 70 && score >= 60) {
			System.out.print(grade = 'D');
			System.out.println(" 학점: 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
		
		} else {
			System.out.print(grade = 'F');
			System.out.println(" 학점: 불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.");
		} 
		sc.close();
	}
}
