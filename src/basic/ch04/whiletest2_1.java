package basic.ch04;

public class whiletest2_1 {

	public static void main(String[] args) {
		
		// 1부터 5까지 덧셈.
		
		int start = 1;
		int end = 5;
		int sum = 0;
			// 6 <= 5 --> 거짓 == 반복문 종료.
			// 특정 조건을 만들어 반복문을 멈추게 해야 한다.
			// 예시 : 만약, start 값이 10 일때 종료하라.
		boolean flag = true;
		while(flag) {
			
			if(start == 10) {
				// 실행의 제어권을 반납한다.
				
				flag = false;
				
			}
			
			// 1 : 0 = 0 + 1 ==> sum : 1
			// 2 :     1 + 2 ==> sum : 3
			// 3 :     3 + 3 ==> sum : 6
			// 4 :     6 + 4 ==> sum : 10
			// 5 :    10 + 5 ==> sum : 15
			sum =    sum + start;
			System.out.println("sum ("+ start +") : " + sum);
			start++;
					
		}
	}
	
}
