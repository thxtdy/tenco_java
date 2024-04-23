package Starcraft.ver02;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 4;
		hp = 110;
	}

	// getter method
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	// 질럿이 저글링을 공격.
	public void attack(Zergling z) {
		System.out.println(this.name + "이 " + z.getName() + " 을(를) 공격합니다.");
		z.beAttacked(this.power);
	}

	// 질럿이 마린을 공격.
	public void attact(Marine m) {
		System.out.println(this.name + "이 " + m.getName() + " 을(를) 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당함.
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
