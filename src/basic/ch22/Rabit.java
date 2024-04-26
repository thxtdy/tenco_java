package basic.ch22;

public class Rabit implements RaceParticipant{
	
	private final int speed = 2;

	@Override
	public String getName() {
		return "느릿느릿토끼";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
	
	
}
