package basic.ch03;

/**
 * 빠른 평가란?
 * 논리 연산에 있어 첫번째 조건이 결과를 결정할때
 * 두번째 조건을 평가하지 않는 것을 의미한다.
 */

public class Operation7 {

	public static void main(String[] args) {
		
		int number = 5;
		
		int index = 0;
		
		//빠른 평가가 동작하는 식을 만들어보자.
		
		
		// 논리곱(&&)은 두 가지 조건이 다 true 로 판단이 되어야 true 를 출력하는데
		// 첫번째 조건이 false 이기 때문에 두번째 조건은 평가하지 않고 false를 출력해낸다.
		boolean result  = ( (number = number + 10) < 10 ) && ( (index = index + 2) < 10 );
		System.out.println("현재 number 변수의 값은 : " + number);
	    System.out.println("현재 index 변수의 값은 : " + index);
	    
	    // number 값 재설정
	    number = 5;
	    // 논리합을 이용한 빠른 평가식을 만들어보자.
	    result = ((number += 10 ) < 10) || ((index +=2) < 10);
	    
	    
	    System.out.println("number : " + number); 
	    System.out.println("index : " + index);
	    
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		

	}
}