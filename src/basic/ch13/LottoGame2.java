package basic.ch13;

public class LottoGame2 {
	
	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.. 기억
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		
		for(int i = 1; i <= 6; i++) {
		int emptyBox = 0;
			// 5 1 9 7 2 3
		if(gameNumber1 > gameNumber2) {
			emptyBox = gameNumber1;
			
			gameNumber1 = gameNumber2;
			
			gameNumber2 = emptyBox;
			
		}// 1 5 9 7 2 3 
		if(gameNumber2 < gameNumber3) {
			  // 5
			emptyBox = gameNumber2;
			 // 9            9
			gameNumber3 = gameNumber2;
			   // 5
			gameNumber3 = emptyBox;
			
		}//1 5 9 7 2 3
		if(gameNumber3 > gameNumber4) {
			emptyBox = gameNumber3;
			
			gameNumber3 = gameNumber4;
			
			gameNumber4 = emptyBox;
			
		}// 1 5 7 '9 2' 3
		if(gameNumber4 > gameNumber5) {
			
			emptyBox = gameNumber4;
			
			gameNumber4 = gameNumber5;
			
			gameNumber5 = emptyBox;
			
		}//1 5 7 2 9 3
		if(gameNumber5 > gameNumber6) {
			emptyBox = gameNumber5;
			
			gameNumber5 = gameNumber6;
			
			gameNumber6 = emptyBox;
		//--------------------------------11111111111	
		}
		}
	

			
		
		
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		
		// 오름 차순 정렬해보기
		
	} // end of main

} // end of class
