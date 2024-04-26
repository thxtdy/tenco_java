package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect{

	@Override
	public void turnOn() {
		System.out.println("냉장고 위이잉 작동.");
	}

	@Override
	public void turnOff() {
		System.out.println("근데 냉장고는 꺼지면 안되지 않나?");
	}

	@Override
	public void soundOn() {
		System.out.println("따딴 따라라란~");
		
	}

	

	
}
