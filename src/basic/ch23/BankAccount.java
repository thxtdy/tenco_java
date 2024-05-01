package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public synchronized void saveMoney(int money) {

		int currentMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		setMoney(currentMoney + money);

		System.out.println("입금 후 계좌 잔액 : " + getMoney());

	}

	// 출금
	public int withDraw(int money) { 
		// synchronized <== 동기화 처리. 임계영역에 접근 후 공유자원을 락 걸고 다른 thread 의 접근을 제한.

		synchronized (this) {
			int currentMoney =  getMoney();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 방어적 코드
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("잔액이 부족합니다.");
				return 0;
			}
		}
		// ... 시간 : 출금 < 입금 (0.5)

		

	}
}
