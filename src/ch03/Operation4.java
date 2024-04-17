package ch03;

/**
 * 복합대입연산자란 대입 연산자와 다른 연산자가 함께 쓰이는 것 (산술연산자)
 * 
 */

public class Operation4 {

	public static void main(String[] args) {

		int n1 = 100;
		n1 += 10;
		
		System.out.println("n1 : " + n1);

		 // 기존값 (int score =5 에 10을 더한다)

//		System.out.println("점수 확인 : " + score);
		
		int score = 5;

		// score 변수에 접근해 기존에 존재하는 값에 더하기 10을 해주세요.

		score += 10;


		// score 변수에 접근해서 10점 감소 시켜주세요 = '-='

		score -= 10;

		// score 변수에 접근해서 2배로 늘려주세요 = '*='

		score *= 2;

		// score 변수에 접근해서 반으로 감소시켜주세요 = '%='

		score %= 2;

		System.out.println("score : " + score);

	}

}
