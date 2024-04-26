package basic.ch22;

interface Animal {
	// 추상 메서드만 선언 가능하다 ...
	//	public abstract void eat();
	//	public abstract void move();
	
	// 축약 가능
	void eat();
	void move();
	
}
 // implements - 구현하다
class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("먹이를 먹다.");
		
	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 슉슉슉 다닌다.");
		
	}
	
}

class Bird implements Animal{

	@Override
	public void eat() {
		System.out.println("모이를 콕콕 먹다.");
	}

	@Override
	public void move() {
		System.out.println("훨훨훨훨 날라다니다.");
		
	}
	
}