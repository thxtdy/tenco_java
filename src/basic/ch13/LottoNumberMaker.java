package basic.ch13;

import java.util.Random; // <-- 자바 도구

public class LottoNumberMaker {
	
	// 멤버 변수
	private String version = "1.0.0";
	
	// main 함수
	public static void main(String[] args) {
		
		makeNumber();
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
	}// end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
	// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서를 잘 숙지하도록도록도록도르르로르
		//	System.out.println("ver : " );
		// 자바 도구 -- 표준 API
		// 난수 발생기 -> 랜덤적인 값를 생성
		Random random = new Random(); // < 기본 생성자
		int resultnumber = random.nextInt(45) + 1; // (45) == 0~~~~44까지 // + 1 써주면 1~45까지 나옴
		
		return resultnumber; // 반환값을 받기에 미리 써주고 수정도 ㄱㅊ
	}
	
	
}
