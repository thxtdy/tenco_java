package basic.exercise;


public class RealRealMainTest {
	
	public static void main(String[] args) {
		
	
	Warrior warrior = new Warrior("전사", 30);
	Wizard wizard = new Wizard("마법사", 45);
	
	warrior.attackwizard(wizard);
	System.out.println(wizard.hp);
	
	}
}
