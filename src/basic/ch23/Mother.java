package basic.ch23;

public class Mother extends Thread{

	BankAccount account;
		
	public Mother(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.withDraw(5_000); // <== 5천원 출금 요청 - 다른 작업자에게 위임 함.
	}
	
}
