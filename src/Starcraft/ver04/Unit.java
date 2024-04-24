package Starcraft.ver04;
/**
 * public
 * private
 * default
 * protected -- 상속 관계에서만 그 객체에 접근할 수 있다.
 */
public class Unit {
	
	protected String name;
	protected int power;
	protected int hp;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("[" + this.name + "] You Died@!@,,~");
			hp = 0;
			return;
		}
		hp -= power;
	}
	
	// 질럿이 저글링을 공격.
	public void attack(Unit z) {
		System.out.println(this.name + "이 " + z.getName() + " 을(를) 공격합니다.");
		z.beAttacked(this.power);
		
		
	}


	
	
	
	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("HP : " + this.hp);
		System.out.println("===== ===== =====");
	}
}
