package basic.ch17;

public class Hero {

	String name;
	int hp;

	public void Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;

	}

	public static void main(String[] args) {
		
		Archer ad = new Archer("Ad", 10);
		Warrior war = new Warrior("war", 12);
		Wizard wiz = new Wizard("wiz", 8);
		
		war.attack();
		ad.firearrow();
		wiz.freeze();
		
		war.basicAttack();
		ad.basicAttack();
		wiz.basicAttack();
		
		
		
	}
}

class Archer extends Hero {

	public Archer(String name, int hp) {
		super();
	}
	
	void basicAttack() {
		System.out.println("매직평타얍");
	}
	
	void firearrow() {
		System.out.println("불화살");
	}

}

class Wizard extends Hero {
	
	public Wizard(String name, int hp) {
		super();
	}
	void basicAttack() {
		System.out.println("원딜평타얍");
	}
	void freeze() {
		System.out.println("얼려버리기");
	}


}

class Warrior extends Hero{
	
	public Warrior(String name, int hp) {
		super();
		
		
	}
	void basicAttack() {
		System.out.println("전사평타얍");
	}
	void attack() {
		System.out.println("이단 공격");
	}
}
