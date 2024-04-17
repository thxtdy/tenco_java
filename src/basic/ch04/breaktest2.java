package basic.ch04;

public class breaktest2 {
	
	public static void main(String[] args) {
		
		// for 문 대신에 while 로 변경 후, 결과를 출력.
		
		// 소수 7이면 반복문을 멈추어라.
		
		
	
		int num = 0;
		while(num <= 10) {
			num += 1;
			System.out.println(num);
			
			if(num == 7) {
				break;
			}// end of if
		}//end of while
		
		
	}//end of main

}//end of class


/**
 *  답안
 *  int 1 = 1;
 *  while( i < 11 )
 *  
 *  	if ( i & 7 == 0){ // if 단독문은 수행이 될 수도 있고 안될 수도 있고
 *  	break;
 *  	}
 *  
 *  	System.out.println("i의 값 :" + i );
 *  
 *  	i++;
 *  
 *  
 */







