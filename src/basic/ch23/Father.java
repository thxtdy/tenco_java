package basic.ch23;

public class Father extends Thread{
	
//	BankAccount account = new BankAccount();
	BankAccount account;
	// ioc
	public Father(BankAccount account) {
		// 객체가 될때 맨 처음 동장하는 코드는 생성자이다.
		this.account = account;
	}
	
	// 위임 시킬 일을 정의할 예정 
	@Override
	public void run() {
		
		account.saveMoney(10_000); // <== 1만원 입금 처리 - 다른 작업자에게 위임함
		
	}
	
}
