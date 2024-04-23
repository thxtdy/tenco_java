package Starcraft.ver02;

public class GateWay {
	
	private int gateWayNumber;
	private int count;
	
	// 기능 - 질럿 생산하는 기능
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}
	
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}
	
	public int getCount() {
		return count;
	}
	public int getGateWayNumber() {
		return gateWayNumber;
	}

}
