package basic.ch09;

public class Bus {
	
	int busnum;
	int passengercount;//승객 수
	int money;// 수익금
	
	// 강제성 부여
	
	public Bus(int number) {
		// 객체 생성 시에 제일 먼저 실행되는 부분
		busnum = number;
	}
	
	// 승객을 태운다.
	public void take(int pay) {
		money += pay;
		passengercount++;
		
	
	}
	// 현재 상황을 보여주는 기능을 만들어보자.
	public void showInfo() {
		System.out.println("버스 번호 : " + busnum);
		System.out.println("버스 승객수 : " + passengercount);
		System.out.println("버스 수익금 : " + money);
	}
	
	
}
