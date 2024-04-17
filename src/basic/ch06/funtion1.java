package basic.ch06;

// 자바의 모든 코드는 class XXX {} 블록 안에 코드를 작성하기로 약속 되어있다.
public class funtion1 {
	// 메인 함수 - void = 텅 빈(리턴값이 없다.)
			
	public static void main(String[] args) {
		
		int num1;
		int num2;
		double sum;
		
		add(10, 10);
		calcSum(333, 666);
		double result333 = calcSum(1, 90);
		System.out.println(result333);
		
		
	} // end of main		
 	static int add(int n1, int n2) {
 		int result;
 		result = n1 + n2;
 		return result;
 		
 	}
 	
 	// 함수를 수정 == 파라메터 정수 2개를 받을 수 있도록 설계
 	// s1, s2 --> 반복
static int calcSum(int s1, int s2) {
		
		
		int sum = 0;
		int i;
		for (i = s1; i <= s2; i++) { // 100번 동작하는 친구
			
			sum = (s1 + s2) /2; // 0 = 0 + 1 --------> total : 5050
			
			
		}
		return sum;
		
	}
} // end of class

// int a; 사용 못함