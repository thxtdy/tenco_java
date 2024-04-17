package basic.exercise;

public class Warrior {
	
	String name;
	int power;
	int hp = 100;
	
	public Warrior(String myName, int myPower) {
		
		name = myName;
		power = myPower;
		
		}
	public void attackwizard(Wizard wizard) {
		wizard.attack(this.power);
		
	}
	public void attack(int power) {
		if(hp <= 0) {
			System.out.println("사망");
			return;
	}
		hp -= power;
		
		
		
	}
	
}
