package Starcraft.ver03;

public class StarCraftTest1 {
	
	public static void main(String[] args) {
		
		Zealot zeolot1 = new Zealot("질럿 1");
		Marine marine1 = new Marine("마린 1");
		Zergling zergling = new Zergling("저글링1");
		
		zeolot1.showInfo();
		marine1.showInfo();
		zergling.showInfo();
		
		System.out.println("--------------------------------------");
		
		zeolot1.attact(marine1);
		marine1.showInfo();
		
		zergling.attact(marine1);
		marine1.showInfo();
	}
	
}
