package basic.ch12;

public class staticpractice {
	
	private String BankName = "우리은행";
	
	private static int account;
		
	public staticpractice(int Ac) {
		this.account = Ac;
		account = 111;
	}
	public void printaccountNumber() {
		
		
		System.out.println( BankName + "의 계좌 번호는 " + account);
		account +=111;
	}
	
}
