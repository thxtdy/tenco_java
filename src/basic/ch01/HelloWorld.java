package basic.ch01;

public class HelloWorld {

	// <- 주석, 한줄 주석(컴파일러가 무시하는 영역)
	public static void main(String[] args) {

		// 화면에(콘솔 창에) 출력하는 명령어
		System.out.println("Hello World");

		System.out.println(); // 출력 후 다음 줄로 넘어가는 역할을 합니다.
		// 숫자 0부터 9까지 화면에 하나씩 출력하시오.
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		
		
		
		// 우리 일상에서는 10진수라는 개념을 많이 사용하고 있다.
		// 10진수란 뭘까?
		// 0~9까지 사용하는 수를 말한다.
		// 10을 표현할때 < -- 단위 1을 올리고 0부터 다시 시작하는 개념
		
		// 그럼 이진수란
		// 0과 1로만 이루어진 숫자 체계이다.
		// 2진수로 2를 표현한다면
		// 1 --> 2 단위 1을 올리고 -- > 10 (십진수에서 2이다.)
		// 이진수로 3을 표현한다면
		// 1 ->> 10 --->? 11(십진수 숫자 3이다.)
		
		System.out.println("코드를 수정했어");
		
	}// end of main

} // end of class
