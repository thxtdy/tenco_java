package basic.exercise;

public class Exercise1 {
	
	// 코드의 시작점(main 함수)
	public static void main(String[] args) {
		
	  int asdf = 10;
	  int qwer = 100;
	  int zxcv = 100;
	  
	  System.out.println(asdf);
	  System.out.println(qwer);
	  System.out.println(zxcv);
	  
	  int ageBox;
	  ageBox = 20;
	  int oldBox = ageBox;
	  ageBox = 30;
	  
	  System.out.println("ageBox : " + ageBox);
	  System.out.println("oldBox : " + oldBox);
	  
	  int a = 1;
	  int b = 3;
	  // 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
	  // 넣어두면 된다.
	  
	  int temp = a; // <-- 스위칭의 핵심
	  
	  a = b; //a=3
	  b = temp;
	  
	  
	  System.out.println(a);
	  System.out.println(b);
	  
	  
	  
	  
	}// end of main

}// end of class
