package basic.ch21;

public class Tiger extends Animal{
	// 재정의 - 구현 메서드
	@Override
	public void hunt() {
		System.out.println("호랑이가 사냥에 나선다");
	}
	
	@Override
	public void move() {
		System.out.println("살금살금 기어서 가자 엉금엉금 칙칙 흙흙쌀쌀");
	}
	
}
