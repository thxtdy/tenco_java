package basic.ch06;

// 배운 다음에 ...
// 자바의 모든 코드는 class XXX {} 블록 안에 코드를 작성하기로 약속 되어있다.
public class functionMainTest1 {
	// 메인 함수 - void = 텅 빈(리턴값이 없다.)
	public static void main(String[] args) {

		System.out.println("여기 메인 함수를 시작합니다.");
		int result1 = add(5, 10);
			System.out.println("result1 : " + result1);
			
			// 성적 합을 구한다.
			int result2 = add(90, 80);
			System.out.println("result2 : " + result2);
		} // end of main
	
	static int add(int n1, int n2) {
		
		int result; // 변수 -> 지역 변수
		result = n1 + n2;
		return result;
		
	} // end of add

	} // end of class

// int a; 사용 못함