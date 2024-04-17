package basic.ch09;

public class subway {
	
	int lineNum;
	int passengerNum;
	int money;
	
	public subway(int line) {
		lineNum = line;
		
	}

	
	

	// 지하철도 승객을 태우다.
	public void take(int pay) {
		money += pay;
		passengerNum++;
	}
	
	public void showInfo() {
		System.out.println("지하철 번호 : " + lineNum);
		System.out.println("지하철 승객수 : " + passengerNum);
		System.out.println("지하철 수익금 : " + money);
	}
	
}
