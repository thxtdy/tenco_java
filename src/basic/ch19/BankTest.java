package basic.ch19;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank("그린그린열매은행"); // 독립적인 생명 주기를 가진다.
		Customer customer = new Customer("박박태태현현"); // 독립적인 생명 주기를 가진다.
		// 연관관계라고 한다.
		customer.useBankService(bank);
		
		System.out.println("------------------------------------------------");
		//enum type 연습
		bank.provideService(ServiceType.ACCOUNT_INFO, customer);
	}
	
}
