package basic.ch09;

public class Student {
	
	String name;
	int money; // 소지금
	int hp;
	
	public Student(String myName, int myMoney, int myHp) {
		name = myName;
		money = myMoney;
		hp = myHp;
	}
	
	
	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		
		bus.take(1450);
		money -=1450;
	}
	
	// 학생이 지하철을 탄다.
	public void takeSubway(subway subway) {
		subway.take(1450);
		money-=1450;
	}
	
	public void boom(mushroom mush) {
		mush.takehp(20000);
		hp -=20000;
	}
	
	// 상태창을 보여준다.
	
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 소지금 : " + money);
		System.out.println("학생 HP : " + hp);
	}
	
	
	
}
