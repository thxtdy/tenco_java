package basic.ch04;

public class IfelseIfelse {
	
	public static void main(String[] args) {
		
		int age = 17;
		
		if(age < 7) { // if else if else 사용 시, 첫 조건의 범위 설정 /\ 을 좁게 해야 함. -> 점점 더 넓게
			System.out.println("학교에 아직 다니지 않습니다");
		} else if (age <= 13) {
			System.out.println("초딩");
		} else if (age <=16) {
			System.out.println("중딩");
		} else {
			System.out.println("고딩 아님 성인");
		} // end of if (else)
		
		
		
	} // end of main

} // end of class
