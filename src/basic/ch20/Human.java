package basic.ch20;

public class Human extends Animal{
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("밥을 냠냠 먹습니다.");
	}
	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}
	
}
