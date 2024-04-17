package basic.ch10;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메서드
	
	public String getHeroinfo() {
		return this.name;
	}
	public void SetHeroinfo(String myName) {
		this.name = myName;
	}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int myHp) {
		this.hp = myHp;
	}
	
	public int getPower() {
		return this.power;
	}
	public void setPower(int myPower) {
		this.power = myPower;
	}
	
	public double getDefense() {
		return this.defense;
	}
	public void setDefense(double myDefense) {
		this.defense = myDefense;
	}
	
	public boolean getIsdie() {
		return this.isDie;
	}
	public void setisdie(boolean myDie) {
		this.isDie = myDie;
	}

}
