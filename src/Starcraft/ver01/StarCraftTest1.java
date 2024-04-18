package Starcraft.ver01;

public class StarCraftTest1 {

	public static void main(String[] args) {

		Zealot zea1 = new Zealot("김장원");
		Zealot zea2 = new Zealot("최현호");

		Zergling zg1 = new Zergling("박용진");
		Zergling zg2 = new Zergling("유재성");
		
		Marine m1 = new Marine("박소망");
		Marine m2 = new Marine("정민제");
		
		for(int i = 0; i < 10; i++) {
			zea1.attactMarine(m2);
		}
		m2.showInfo();
		
	}
}
