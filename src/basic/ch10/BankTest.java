package basic.ch10;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		
		bank1.getName();
		bank1.inMoney(10000);
		bank1.outMoney(5000);
		bank1.outMoney(100000);
		
//		bank1.balance = 100_000; <--- private 변경 후 정보 은닉되었다.
		bank1.inMoney(100_000);
		
		// 실행의 흐름을 만들 예정
		// 현재 은행에 전체 잔고가 200_000 이하라면 본점에 금액 요청상황...
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if(money <= 200_000) {
			System.out.println("본점에 금액을 요청해");
		}
		
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		
		bank1.setBalance(-1000000);
		System.out.println(bank1.getBalance());
		
	}// end of main

}// end of class
