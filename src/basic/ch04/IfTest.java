package basic.ch04;

// 변수명을 작성할 때 -- 약속(권장사항 --> 코딩 컨벤션
// int myScore; : <-- 카멜 표기법
// 첫 시작의 단어를 대문자로 작성하고 연결의 단어도 대문자 표기한다면
// ----> 파스칼 케이스
public class IfTest {
	// 코드의 시작점 ( 메인 함수 )
	public static void main(String[] args) {
		
		// 조건문(제어문) if
		// 주어진 조건에 따라서 실행이 이루어지도록 흐름을 만든다.
		// if ..... -> 만약 ... 이라면~
		
		boolean flag = false;
		
		if (flag == true) {
			    // 수행 구문
			   System.out.println("너 가능^ㅛ^");
			   flag = false;
			   
			   
			
			
		} // end of if -? 블록의 범위를 기억하자
		// if 구문은 단독으로 실행이 될 수도 있고 안 될 수도 있고
		System.out.println("코드가 여기까지 내려옵니다. : " + flag);
		
		
		
	} // end of main

} // end of class
