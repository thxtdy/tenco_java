package basic.ch10;

// 은행
public class Bank {

	// 아무것도 지정하지 않으면 default 제어 지시자이다.
	// private 는 클래스 안에서만 사용가능하다.
	private String name;
	private int balance; // 잔액 // 정보 은닉 --> 외부에서 확인 안되어야 하는 중요한 변수를 감춘다.
	String User;
	int number =3521446;
	
	// 정보
	public void inforMation(String me) {
		User = me;
		System.out.println("안녕하세요." + me +"(님)!");
		System.out.println("농협" + number);
	}
	// 입금
	public void inMoney(int money) {
		
		balance += money;
		System.out.println(money + "(원)을 입금했습니다.");
		showInfo();
	}
	// 출금
	public int outMoney(int money) {
		if(balance < money) {
			System.out.println("잔액이 " + (money - balance) +"(원) 부족합니다.");
		return 0;
		}
		balance -= money;
		System.out.println(money + "(원)을 출금했습니다.");
		showInfo();
		return money;
	}
	public void showInfo() {
		System.out.println("현재 잔액은 " + balance + "(원)입니다.");
	}
	// 정보 은닉(private) 후에 getter, setter  메서드를 설계해둘 수 있다...
	// get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	// setter 멤버 변수에 접근해서 객체의 상태값을 변경하게 하는 메서드이다.
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setBalance(int money) {
		if(money < 0) {
			System.out.println("wrong");
		} else {
			this.balance = money;
		}
	}

}
