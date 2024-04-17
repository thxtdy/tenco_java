package basic.ch04;

public class continuetest2 {
	public static void main(String[] args) {

		// 1부터 100까지의 숫자 중에 3의 배수를 출력하세요.
		
		// 1 ~ 100 == 반복적인 패턴.
		
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		
		// 반복문은 while 를 사용해 주세요.
	
			int num = 0;
			
			while(num <= 100) {
				
				num += 1;
				
				
				if(num % 3 == 0) {
					System.out.println("3의 배수 : " + num);
				}
			}
			// boolean flag = true 사용
			// while(flag){
			// if ( i % 3 == 0){
			// System.out.println("3의 배수 : " + i); } }
			
			// if( i == 100){
			//	flag = false;
			
		
		
	}// end of main
}// end of class
