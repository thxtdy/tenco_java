package basic.ch13;

public class LottoGame {
	
	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.. 기억
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
//		int gameNumber3 = LottoNumberMaker.makeNumber();
//		int gameNumber4 = LottoNumberMaker.makeNumber();
//		int gameNumber5 = LottoNumberMaker.makeNumber();
//		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		
		if(gameNumber2 < gameNumber1) {
			int emptyBox;
			emptyBox = gameNumber1;
			
			gameNumber1= gameNumber2;
			
			gameNumber2 = emptyBox;
		}
//		}else if(gameNumber3 < gameNumber2) {
//			int emptyBox;
//			emptyBox = gameNumber2;
//			
//			gameNumber2 = gameNumber3;
//			
//			gameNumber3 = emptyBox;
//		}
		
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
		
		// 오름 차순 정렬해보기
		
	} // end of main

} // end of class
