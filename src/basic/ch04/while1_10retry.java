package basic.ch04;

public class while1_10retry {
	
	public static void main(String[] args) {
		
		int start = 1;
		int result = 0;
		
		
		while(start <= 10) {
			
			result = result + start;
			//   start = 1 , result 1
			//   start = 2 , result 3
			//   start = 3  ,result 6
			start++;
		} // end of while
		System.out.println(result);
	} // end of main

}  // end of class 
