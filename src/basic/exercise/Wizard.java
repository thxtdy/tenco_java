package basic.exercise;

public class Wizard {
	
	String name;
	int power;
	int hp = 70;
	
	public Wizard(String myName, int myPower) {
		
		name = myName;
		power = myPower;
		
	}
	
	public void attackWarrior(Warrior warrior) {
		warrior.attack(this.power);
	}
	
	public void attack(int power) {
		
		if(hp <= 0) {
			System.out.println("사망");
			return;
		}
		hp -= power;
	}

}
