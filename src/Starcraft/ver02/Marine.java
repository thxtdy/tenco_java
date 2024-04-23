package Starcraft.ver02;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	public Marine(String name) {
		this.name = name;
		power = 5;
		hp = 100;
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
	// 마린이 질럿 공격
	public void attack(Zealot z) {
		System.out.println(this.name + "이 " + z.getName() + " 을(를) 공격합니다.");
		z.beAttacked(this.power);
	}
	// 마린이 저글링 공격
	public void attack(Zergling zg) {
		System.out.println(this.name + "이 " + zg.getName() + " 을(를) 공격합니다.");
		zg.beAttacked(this.power);
	}
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("[" + this.name + "] You Died@!@,,~");
			hp = 0;
			return;
		}
		hp -= power;
	}
	public void showInfo() {
		System.out.println("==== 상태창 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("HP : " + this.hp);
		System.out.println("===== ===== =====");
	}
}
